package com.yobrunox.ejercicio_pc.service;

import com.yobrunox.ejercicio_pc.dto.AppDTO;
import com.yobrunox.ejercicio_pc.models.App;
import com.yobrunox.ejercicio_pc.models.Dispositivo;
import com.yobrunox.ejercicio_pc.repository.AppRepository;
import com.yobrunox.ejercicio_pc.repository.DispositivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService {

    @Autowired
    private final AppRepository appRepository;
    private final DispositivoRepository dispositivoRepository;


    public AppService(AppRepository appRepository, DispositivoRepository dispositivoRepository1) {
        this.appRepository = appRepository;
        this.dispositivoRepository = dispositivoRepository1;
    }

    public App addApp(AppDTO appDTO){
        App appTemp = new App();
        Dispositivo dispositivoTemp = dispositivoRepository.findById(appDTO.getIdDispositivo()).orElse(null);
        appTemp.setId(0);
        appTemp.setNombre(appDTO.getNombre());
        appTemp.setTiempoUsoMinutos(appDTO.getTiempoUsoMinutos());
        appTemp.setCalificacion(appDTO.getCalificacion());
        appTemp.setTipo(appDTO.getTipo());
        appTemp.setMemoriaOcupada(appDTO.getMemoriaOcupada());
        appTemp.setDispositivo(dispositivoTemp);

        return appRepository.save(appTemp);
    }




}
