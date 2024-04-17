package com.yobrunox.ejercicio_pc.dto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dispositivo_MinutosJuegoDTO {

    private String nombreDispositivo;
    private Long sumaDeMinutos;
}
