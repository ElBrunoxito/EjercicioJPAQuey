package com.yobrunox.ejercicio_pc.service;

import com.yobrunox.ejercicio_pc.dto.DispositivoDTO;
import com.yobrunox.ejercicio_pc.dto.Dispositivo_MinutosJuegoDTO;
import com.yobrunox.ejercicio_pc.dto.FechasDTO;
import com.yobrunox.ejercicio_pc.models.Dispositivo;
import com.yobrunox.ejercicio_pc.repository.DispositivoRepository;
import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class DispositivoService {
    @Autowired
    private final DispositivoRepository dispositivoRepository;

    public DispositivoService(DispositivoRepository dispositivoRepository1) {
        this.dispositivoRepository = dispositivoRepository1;
    }

    public Dispositivo addDispositivo(DispositivoDTO dispositivoDTO) {
        Dispositivo dispositivoTemp = new Dispositivo();
        dispositivoTemp.setId(0);
        dispositivoTemp.setNombre(dispositivoDTO.getNombre());
        dispositivoTemp.setTipo(dispositivoDTO.getTipo());
        dispositivoTemp.setFechaCompra(dispositivoDTO.getFechaCompra());

        return dispositivoRepository.save(dispositivoTemp);
    }

    public List<Dispositivo_MinutosJuegoDTO> getDispositvo_MinutosJuegoPorMinutosDeAppJuego() {
        //return dispositivoRepository.getDispositivo_MinutosJuegoPorMinutosDeAppJuego().stream().map(this::mapToDTO).collect(Collectors.toList());
        return dispositivoRepository.getDispositivo_MinutosJuegoPorMinutosDeAppJuego();
    }

    private Dispositivo_MinutosJuegoDTO mapToDTO(Object[] resultado) {
        return new Dispositivo_MinutosJuegoDTO((String) resultado[0], (Long) resultado[1]);
    }

    public Long getPorTotaldeDispoEnUnTiempo(FechasDTO fechasDTO) {

        Long cantidad = dispositivoRepository.getPorTotaldeDispoEnUnTiempo(fechasDTO.getFechaInicio(), fechasDTO.getFechaFin());
        //Map<String,Long> stringLongMap = new HashMap<>();
        //stringLongMap.put("xd",cantidad);
        System.out.println(cantidad);
        return cantidad;

    }

}