package com.personal.intercambio.canada.dtos;

import com.personal.intercambio.canada.entities.statusViagem;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class ViagemDto {

    @NotBlank
    String cidadeDestino;

    @NotBlank
    String provincia;

    @NotNull
    private LocalDate dataEmbarque;

    @NotBlank
    private statusViagem status;

}
