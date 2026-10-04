/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejmherencia;

/**
 *
 * @author UCF20411
 */
public class Obrero extends Trabajador {
    private double Jornal;

    public Obrero(String tipo_doc) {
        super(tipo_doc);
    }

    public double getJornal() {
        return Jornal;
    }

    public void setJornal(double Jornal) {
        this.Jornal = Jornal;
    }
    
    public void CalcularJornalMensual(int diastrabajados){
        Double rpta = diastrabajados*this.Jornal;
        System.out.println("El Jornal Mensual es: " +rpta);
    }

    @Override
    public void verDatos() {
        System.out.println("Obrero TipoDoc: " + this.tipo_doc 
                + " NroDoc: " + this.nro_doc 
                + " Nombre: " + this.nombre 
                + " Apellido paterno: " + this.paterno 
                + " Apellido materno: " + this.materno 
                + " Fecha de nacimiento: " + this.fecha_nac
                + " Jornal: " + this.Jornal);
    }
}
