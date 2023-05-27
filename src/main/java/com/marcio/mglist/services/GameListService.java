package com.marcio.mglist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcio.mglist.dto.GameListDTO;
import com.marcio.mglist.entities.GameList;
import com.marcio.mglist.repositories.GameListRepository;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true) // para obdecer aos propriedades ACID
    public List<GameListDTO> findAll() {
        
        List<GameList> result = gameListRepository.findAll();

        List<GameListDTO> resultDTO = result.stream().map(x -> new GameListDTO(x)).toList(); // transforma a lista de 'Games' em uma lista de 'GameMinDTO'

        return resultDTO;

    }

}