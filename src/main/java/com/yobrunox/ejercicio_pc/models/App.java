package com.yobrunox.ejercicio_pc.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class App {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String Nombre;
    private Long tiempoUsoMinutos;
    private Double Calificacion;
    private String Tipo;
    private Double memoriaOcupada;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idDispositivo",nullable = false )
    private Dispositivo dispositivo;
}
