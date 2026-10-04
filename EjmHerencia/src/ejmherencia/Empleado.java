/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejmherencia;

/**
 *
 * @author UCF20411
 */
public class Empleado extends Trabajador {
    private double Sueldo;

    public Empleado(String tipo_doc) {
        super(tipo_doc);
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }
    
    public void CalcularSueldoMensual(int nrofaltas){
        Double rpta = this.Sueldo - (this.Sueldo/30) * nrofaltas;
        System.out.println("El Sueldo Mensual es: " +rpta);
    }

    @Override
    public void verDatos() {
        System.out.println("Empleado TipoDoc: " + this.tipo_doc 
                + " NroDoc: " + this.nro_doc 
                + " Nombre: " + this.nombre 
                + " Apellido paterno: " + this.paterno 
                + " Apellido materno: " + this.materno 
                + " Fecha de nacimiento: " + this.fecha_nac
                + " Sueldo: " + this.Sueldo);
    }
    
    
}
