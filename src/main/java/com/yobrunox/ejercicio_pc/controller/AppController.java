package com.yobrunox.ejercicio_pc.controller;

import com.yobrunox.ejercicio_pc.dto.AppDTO;
import com.yobrunox.ejercicio_pc.models.App;
import com.yobrunox.ejercicio_pc.service.AppService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Aguilar/App")
@AllArgsConstructor
public class AppController {
    @Autowired
    private final AppService appService;

    @PostMapping("/")
    @ResponseBody
    public ResponseEntity<App> addApp(@RequestBody AppDTO appDTO){
        return new ResponseEntity<>(appService.addApp(appDTO), HttpStatus.CREATED);
    }



}
