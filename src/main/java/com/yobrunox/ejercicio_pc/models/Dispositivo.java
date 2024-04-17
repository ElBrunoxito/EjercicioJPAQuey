package com.yobrunox.ejercicio_pc.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dispositivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String Tipo;

    @Basic
    private String SO;

    @Column(nullable = false)
    private Date fechaCompra;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "dispositivo")
    @JsonIgnore
    private List<App> apps;




}
