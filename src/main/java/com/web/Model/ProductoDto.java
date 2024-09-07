/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.web.Model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author enman
 */
public class ProductoDto {

    @NotEmpty(message = "el nombre es requerido")
    private String nombre;

    @NotEmpty(message = "la marca es requerido")
    private String marca;


    @Min(0)   
    private double precio;
    
    @Size(min =10,message = "la  descripcion debe tener mas de 10 caracteres")
    @Size(max =10, message ="la descripcion no debe tener mas de 200 caracteres")
    private String descripcion;
   
   
    private MultipartFile imagenarchivonombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public MultipartFile getImagenarchivonombre() {
        return imagenarchivonombre;
    }

    public void setImagenarchivonombre(MultipartFile imagenarchivonombre) {
        this.imagenarchivonombre = imagenarchivonombre;
    }
    
    

}
