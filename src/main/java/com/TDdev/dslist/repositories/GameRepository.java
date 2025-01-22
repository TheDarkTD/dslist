package com.TDdev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TDdev.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
