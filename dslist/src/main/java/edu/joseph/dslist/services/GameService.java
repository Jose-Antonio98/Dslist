package edu.joseph.dslist.services;

import edu.joseph.dslist.dto.GameMinDTO;
import edu.joseph.dslist.model.Game;
import edu.joseph.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        var result = gameRepository.findAll();
        List<GameMinDTO> gameDTO = result.stream().map(x -> new GameMinDTO(x)).toList();
        return gameDTO;
    }
}
