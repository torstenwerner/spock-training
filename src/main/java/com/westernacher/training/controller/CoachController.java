package com.westernacher.training.controller;


import com.westernacher.training.exception.CoachException;
import com.westernacher.training.model.Coach;
import com.westernacher.training.service.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(path = "coaches", produces = MediaType.APPLICATION_JSON_VALUE)
public class CoachController {

    @Autowired
    private CoachService coachService;

    @RequestMapping(path="", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public HttpEntity<Coach> create(@RequestBody Coach coach, UriComponentsBuilder builder) {
        Coach result = coachService.create(coach);

        URI location = builder.path("/coaches/{id}").buildAndExpand(result.getId()).toUri();

        return ResponseEntity.created(location).body(result);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    HttpEntity<Coach> show(@PathVariable Long id) {
        return coachService.findById(id)
                .map(coach -> ResponseEntity.ok(coach))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    HttpEntity<?> update(@PathVariable Long id, @RequestBody Coach coach) {
        try {
            return ResponseEntity.ok(coachService.update(coach));
        } catch (CoachException e) {
            return new ResponseEntity<>(e, HttpStatus.NOT_FOUND);
        }
    }
}
