package com.hellow.eventos.classes.fornecedor;

import com.hellow.eventos.classes.endereco.Endereco;
import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Table(name="Fornecedor")
@Entity(name="Fornecedor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Fornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    private String nome;
    private String cnpj;
    private Integer ativo;
    private String endereco_id;
    private String tipo_id;


    @ManyToOne
    @JoinColumn(name="id_tipo")
    private Tipo tipo;









}
