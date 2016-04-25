package com.westernacher.training.repository;

import com.westernacher.training.model.Coach;
import com.westernacher.training.model.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, Long> {
}
