package com.marcio.mglist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcio.mglist.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
    
}