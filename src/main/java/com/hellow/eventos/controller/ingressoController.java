package com.hellow.eventos.controller;
import java.util.List;

import com.hellow.eventos.classes.Ingresso.Ingresso;
import com.hellow.eventos.classes.Ingresso.IngressoRepository;
import com.hellow.eventos.classes.cliente.Cliente;
import com.hellow.eventos.classes.cliente.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ingresso")






public class ingressoController {



    @Autowired
    private IngressoRepository ingressoRepository;



    @GetMapping("todos")
    private List<Ingresso> getTodosingresso(){return ingressoRepository.findAll();}

    @PostMapping("add")
    public Ingresso addIngresso(@RequestBody Ingresso Ingresso){
        ingressoRepository.save(Ingresso);
        return Ingresso;









}}
