package com.westernacher.training.service;

import com.westernacher.training.model.Coach;

import java.util.Optional;

public interface CoachService {

    Optional<Coach> findById(Long id);

    Coach create(Coach coach);
    Coach update(Coach coach);

}
