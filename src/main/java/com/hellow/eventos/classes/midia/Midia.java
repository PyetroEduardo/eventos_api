package com.hellow.eventos.classes.midia;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="Midia")
@Table(name="Midia")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Midia {@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")


    private String id;
    private String formato;
    private String duracao;
    private String tamanho;
    private String link;
    private String evento_id;
    private String tipo_id;













}

