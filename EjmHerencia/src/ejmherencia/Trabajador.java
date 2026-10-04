/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejmherencia;

import java.time.LocalDate;

/**
 *
 * @author UCF20411
 */
public class Trabajador {
    protected String tipo_doc;
    protected String nro_doc;
    protected String nombre;
    protected String paterno;
    protected String materno;
    protected LocalDate fecha_nac;

    public Trabajador(String tipo_doc) {
        this.tipo_doc = tipo_doc;
    }
    

    public String getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(String tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    public String getNro_doc() {
        return nro_doc;
    }

    public void setNro_doc(String nro_doc) {
        this.nro_doc = nro_doc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public LocalDate getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(LocalDate fecha_nac) {
        this.fecha_nac = fecha_nac;
    }
    
    public void verDatos(){
        System.out.println("Trabajador TipoDoc: " + this.tipo_doc 
                + " NroDoc: " + this.nro_doc 
                + " Nombre: " + this.nombre + " Apellido paterno: " 
                + this.paterno + " Apellido materno: " + this.materno 
                + " Fecha de nacimiento: " + this.fecha_nac);
    }
}
