package com.hellow.eventos.classes.evento;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Table(name="evento")
@Entity(name="evento")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private Date data;
    private String descricao;
    private int lotacao;
    @OneToMany
    private int endereco_id;
    @OneToMany
    private int tipo_id;

}
