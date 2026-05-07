package com.personal.intercambio.canada.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "estudante")

@Data
@NoArgsConstructor
public class EstudanteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "passaporte", unique = true)
    private String passaporte;

    @Column(name = "idade")
    private Integer idade;


}
