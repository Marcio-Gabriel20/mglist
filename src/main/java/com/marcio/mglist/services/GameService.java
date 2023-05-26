package com.marcio.mglist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcio.mglist.dto.GameMinDTO;
import com.marcio.mglist.entities.Game;
import com.marcio.mglist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        
        List<Game> result = gameRepository.findAll();

        List<GameMinDTO> resultDTO = result.stream().map(x -> new GameMinDTO(x)).toList(); // transforma a lista de 'Games' em uma lista de 'GameMinDTO'

        return resultDTO;

    }

}