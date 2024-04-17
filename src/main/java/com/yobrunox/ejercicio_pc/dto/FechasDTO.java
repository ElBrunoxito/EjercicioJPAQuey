package com.yobrunox.ejercicio_pc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FechasDTO {
    private Date fechaInicio;
    private Date fechaFin;
}
