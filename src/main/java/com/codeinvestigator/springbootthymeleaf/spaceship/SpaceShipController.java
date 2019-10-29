package com.codeinvestigator.springbootthymeleaf.spaceship;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/spaceship")
public class SpaceShipController {

    private final SpaceShipRepository repository;

    public SpaceShipController(SpaceShipRepository repository)
    {
        this.repository = repository;
    }

    @GetMapping("/")
    public String spaceships(Model model)
    {
        model.addAttribute("spaceships", repository.findAll());
        return "spaceshipoverview";
    }
}