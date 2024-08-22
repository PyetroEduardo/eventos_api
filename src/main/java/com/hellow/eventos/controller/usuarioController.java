package com.hellow.eventos.controller;

import com.hellow.eventos.classes.usuario.usuario;
import com.hellow.eventos.classes.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class usuarioController {


    @Autowired
    private UsuarioRepository usuarioRepository;


    @GetMapping("todos")
    private List<usuario> getTodosUsuario(){return usuarioRepository.findAll();}

    @PostMapping(name="add")
    public usuario addusuario(@RequestBody usuario usuario ){
        usuarioRepository.save(usuario);
        return usuario;

















}}