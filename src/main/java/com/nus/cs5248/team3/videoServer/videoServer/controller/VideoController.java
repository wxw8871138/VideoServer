package com.nus.cs5248.team2.videoServer.videoServer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class VideoController {
    @RequestMapping(path = "/index", method = RequestMethod.GET)
    public String index(Model model){
       return "index";
    }

    @RequestMapping(path = "/player", method = RequestMethod.POST)
    public String player(Model model, @RequestParam("videoURL") String videoURL){
        model.addAttribute("videoURL",videoURL);
        return "player.html";
    }

}
