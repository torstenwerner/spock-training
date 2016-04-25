package com.westernacher.training.service;

import com.westernacher.training.exception.CoachException;
import com.westernacher.training.model.Coach;
import com.westernacher.training.repository.CoachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DefaultCoachService implements CoachService {

    @Autowired
    private CoachRepository coachRepository;

    @Override
    public Coach create(Coach coach) {
        return coachRepository.save(coach);
    }

    @Override
    public Optional<Coach> findById(Long id) {
        return Optional.ofNullable(coachRepository.findOne(id));
    }

    @Override
    public Coach update(Coach coach) {
        // check if exists, throw error otherwise
        if (coachRepository.findOne(coach.getId()) != null) {
            return coachRepository.save(coach);
        } else {
            throw new CoachException("Don't know coach", coach);
        }
    }
}
