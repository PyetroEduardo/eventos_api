package com.hellow.eventos.classes.cliente;

import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


    @Entity(name="cliente")
    @Table(name="cliente")
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor


    public class Cliente {@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")

    private String id;
        private String nome;
        private String sobrenome;
        private String cpf;
        private String telefone;
        private String email;;
        private String endereco_id;



    @ManyToOne
    @JoinColumn(name="id_tipo")
    private Tipo tipo;







}
