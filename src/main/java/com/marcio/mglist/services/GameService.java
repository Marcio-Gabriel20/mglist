package com.marcio.mglist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcio.mglist.dto.GameDTO;
import com.marcio.mglist.dto.GameMinDTO;
import com.marcio.mglist.entities.Game;
import com.marcio.mglist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true) // para obdecer aos propriedades ACID
    public GameDTO findById(Long id) {
        
        Game result = gameRepository.findById(id).get(); // o get() nesse caso serve para pegar o game que está dentro do Optional, pois o findById retorna um tipo Optional
        GameDTO gameDTO = new GameDTO(result);

        return gameDTO;

    }

    @Transactional(readOnly = true) // para obdecer aos propriedades ACID
    public List<GameMinDTO> findAll() {
        
        List<Game> result = gameRepository.findAll();

        List<GameMinDTO> resultDTO = result.stream().map(x -> new GameMinDTO(x)).toList(); // transforma a lista de 'Games' em uma lista de 'GameMinDTO'

        return resultDTO;

    }

}