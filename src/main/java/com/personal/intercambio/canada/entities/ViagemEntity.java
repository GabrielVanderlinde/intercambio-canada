package com.personal.intercambio.canada.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "viagem")

@Data
@NoArgsConstructor
public class ViagemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cidadeDestino")
    String cidadeDestino;

    @Column(name = "provincia")
    String provincia;

    @Column(name = "dataEmbarque")
    private LocalDate dataEmbarque;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private statusViagem status;
}
