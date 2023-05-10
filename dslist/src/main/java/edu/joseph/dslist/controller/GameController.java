package edu.joseph.dslist.controller;

import edu.joseph.dslist.dto.GameDTO;
import edu.joseph.dslist.dto.GameMinDTO;
import edu.joseph.dslist.model.Game;
import edu.joseph.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        var result = gameService.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id) {
        return gameService.findById(id);
    }

}
