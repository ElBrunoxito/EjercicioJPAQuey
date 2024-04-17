package com.yobrunox.ejercicio_pc.dto;

import jakarta.persistence.Basic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DispositivoDTO {
    private String nombre;
    private String Tipo;
    private Date fechaCompra;
}
