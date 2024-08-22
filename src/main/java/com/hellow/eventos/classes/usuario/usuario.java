package com.hellow.eventos.classes.usuario;


import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="usuario")
@Table(name="usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor



public class usuario {@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")



private String id;
    private String nome;
    private String sobrenome;
    private String login;
    private String senha;
    private String email;;
    private String dt_nascimento;
    private String dt_criacao;
    private String dt_filiacao;
    private String telefone;
    private String cpf;;
    private String tipo_id;


    @ManyToOne
    @JoinColumn(name="id_tipo")
    private Tipo tipo;








}
