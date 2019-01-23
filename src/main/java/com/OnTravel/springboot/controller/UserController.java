package com.OnTravel.springboot.controller;

import com.OnTravel.springboot.model.Election;
import com.OnTravel.springboot.repository.VoteJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private VoteJpaRepository voteJpaRepository;

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public List<Election> Create(){
        return voteJpaRepository.findAll();
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public Optional<Election> load(@RequestBody final Election election){
        voteJpaRepository.save(election);
        return voteJpaRepository.findById(election.getId());
    }
}
