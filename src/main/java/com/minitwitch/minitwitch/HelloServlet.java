// we should remove HelloServlet since I am using the new controller to handle the request.

package com.minitwitch.minitwitch;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.minitwitch.minitwitch.entity.response.Game;
import org.json.JSONObject;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/game")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("application/json");
//        JSONObject game = new JSONObject();
//        game.put("name", "Overwatch");
//        game.put("developer", "Blizzard Entertainment");
//        game.put("realease_time", "Feb 11, 2016");
//
//        response.getWriter().print(game);
        response.setContentType("application/json");
        ObjectMapper mapper = new ObjectMapper();

        Game.Builder builder = new Game.Builder();
        builder.setName("World of Warcraft");
        builder.setDeveloper("Blizzard Entertainment");
        builder.setReleaseTime("Feb 11, 2005");
        builder.setWebsite("https://www.worldofwarcraft.com");
        builder.setPrice(49.99);

        Game game = builder.build();
        response.getWriter().print(mapper.writeValueAsString(game));

    }

    public void destroy() {
    }
}