package edu.joseph.dslist.services;

import edu.joseph.dslist.dto.GameDTO;
import edu.joseph.dslist.dto.GameListDTO;
import edu.joseph.dslist.dto.GameMinDTO;
import edu.joseph.dslist.model.Game;
import edu.joseph.dslist.model.GameList;
import edu.joseph.dslist.repositories.GameListRepository;
import edu.joseph.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        var result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }

}
