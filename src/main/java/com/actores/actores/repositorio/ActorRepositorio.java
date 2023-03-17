/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.actores.actores.repositorio;

import com.actores.actores.modelo.Actores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ADSI
 */
@Repository
public interface ActorRepositorio extends JpaRepository<Actores, Long>{
    
}
