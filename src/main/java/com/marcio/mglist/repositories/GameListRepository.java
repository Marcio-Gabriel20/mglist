package com.marcio.mglist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcio.mglist.entities.GameList;

@Repository
public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}