package com.yobrunox.ejercicio_pc.dto;

import com.yobrunox.ejercicio_pc.models.Dispositivo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppDTO {
    private String Nombre;
    private Long tiempoUsoMinutos;
    private Double Calificacion;
    private String Tipo;
    private Double memoriaOcupada;

    private Integer idDispositivo;
}
