package com.hellow.eventos.controller;
import java.util.List;
import com.hellow.eventos.classes.midia.MidiaRepository;
import com.hellow.eventos.classes.midia.Midia;
import com.hellow.eventos.classes.midia.Midia;
import com.hellow.eventos.classes.midia.MidiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("midia")

public class MidiaController {

    @Autowired
    private MidiaRepository MidiaRepository;

    @GetMapping("todos")
    private List<Midia> getTodosMidia(){return MidiaRepository.findAll();}


    @PostMapping("add")
    public Midia addMidia(@RequestBody Midia midia){
        MidiaRepository.save(midia);
        return midia;










}}
