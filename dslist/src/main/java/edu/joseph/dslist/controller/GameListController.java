package edu.joseph.dslist.controller;

import edu.joseph.dslist.dto.GameDTO;
import edu.joseph.dslist.dto.GameListDTO;
import edu.joseph.dslist.dto.GameMinDTO;
import edu.joseph.dslist.model.GameList;
import edu.joseph.dslist.services.GameListService;
import edu.joseph.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    GameListService gameListService;

    @Autowired
    GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll(){
        var result = gameListService.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId){
        var result = gameService.findByList(listId);
        return result;
    }
}
