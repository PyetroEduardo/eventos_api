package com.hellow.eventos.controller;

import com.hellow.eventos.classes.cliente.Cliente;
import com.hellow.eventos.classes.cliente.ClienteRepository;
import com.hellow.eventos.classes.endereco.Endereco;
import com.hellow.eventos.classes.endereco.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name="endereco")
public class EnderecoController {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @GetMapping("todos")
    private List<Endereco> getTodosEndereco(){return enderecoRepository.findAll();}

    @PostMapping("add")
    public Endereco addEndereco(@RequestBody Endereco endereco){
        enderecoRepository.save(endereco);
        return endereco;



    }}


