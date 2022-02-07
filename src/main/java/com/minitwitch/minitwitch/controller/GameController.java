package com.minitwitch.minitwitch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.minitwitch.minitwitch.service.GameService;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class GameController {
    @Autowired
    private GameService gameService;

    // game?game_name=whatever
    // game
    @RequestMapping(value="/game", method = RequestMethod.GET)
    public void getGame(@RequestParam(value = "game_name", required = false) String gameName,
                        HttpServletResponse response) throws IOException {



    }
}
