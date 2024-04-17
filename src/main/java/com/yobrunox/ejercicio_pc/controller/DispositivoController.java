package com.yobrunox.ejercicio_pc.controller;

import com.yobrunox.ejercicio_pc.dto.DispositivoDTO;
import com.yobrunox.ejercicio_pc.dto.Dispositivo_MinutosJuegoDTO;
import com.yobrunox.ejercicio_pc.dto.FechasDTO;
import com.yobrunox.ejercicio_pc.models.Dispositivo;
import com.yobrunox.ejercicio_pc.service.DispositivoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/Aguilar/Dispositivo")
@AllArgsConstructor
public class DispositivoController {

    @Autowired
    private final DispositivoService dispositivoService;

    @PostMapping("/add")
    @ResponseBody
    public ResponseEntity<Dispositivo> addDispositivo(@RequestBody DispositivoDTO dispositivoDTO){
        return new ResponseEntity<>(dispositivoService.addDispositivo(dispositivoDTO), HttpStatus.CREATED);
    }

    @GetMapping("/getPorSumaMinutosDispositivo")
    @ResponseBody
    public ResponseEntity<List<Dispositivo_MinutosJuegoDTO>> addDispositivo(){
        return new ResponseEntity<>(dispositivoService.getDispositvo_MinutosJuegoPorMinutosDeAppJuego(), HttpStatus.CREATED);
    }


    @PostMapping("/totaldispositvos")
    public ResponseEntity<Long> getPorTotaldeDispoEnUnTiempo(@RequestBody FechasDTO fechasDTO){
        return new ResponseEntity<>(dispositivoService.getPorTotaldeDispoEnUnTiempo(fechasDTO),HttpStatus.OK);

    }


}
