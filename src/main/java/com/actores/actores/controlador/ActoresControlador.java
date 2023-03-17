/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actores.actores.controlador;

import com.actores.actores.modelo.Actores;
import com.actores.actores.repositorio.ActorRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ADSI
 */
@RestController
@RequestMapping("/api/v1/")
public class ActoresControlador {

    @Autowired
    private ActorRepositorio actorRepositorio;
    @GetMapping("/Hola")
    public String hola() {
        return "Hola";
    }

    @GetMapping("/actores")
    public List<Actores> findAll() {
        return actorRepositorio.findAll();
    }
}
