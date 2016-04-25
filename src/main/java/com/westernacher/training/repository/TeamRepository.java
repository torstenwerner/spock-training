package com.westernacher.training.repository;

import com.westernacher.training.model.Coach;
import com.westernacher.training.model.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Long> {
}
