/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.web.Service;

import com.web.Model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author enman
 */
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    
}
