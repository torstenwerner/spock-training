package com.westernacher.training.repository;

import com.westernacher.training.model.Coach;
import org.springframework.data.repository.CrudRepository;

public interface CoachRepository extends CrudRepository<Coach, Long> {
}
