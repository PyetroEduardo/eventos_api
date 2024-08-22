package com.hellow.eventos.controller;

import com.hellow.eventos.classes.cliente.Cliente;
import com.hellow.eventos.classes.fornecedor.Fornecedor;
import com.hellow.eventos.classes.fornecedor.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Fornecedor")
public class FornecedorController {
    @Autowired
    private FornecedorRepository fornecedorRepository;
    @GetMapping("todos")
    private List<Fornecedor> getTodosFornecedor(){return fornecedorRepository.findAll();}
    @PostMapping("add")
    public Fornecedor addFornecedor(@RequestBody Fornecedor fornecedor){
        fornecedorRepository.save(fornecedor);
        return fornecedor;



}}
