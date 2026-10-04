/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejmherencia;

import java.util.ArrayList;

/**
 *
 * @author UCF20411
 */
public class TrabajadorController {
    ArrayList<Trabajador> listatrabajador = new ArrayList();
    
    public void agregarTrabajador(Trabajador nuevotrabajador) {
        listatrabajador.add(nuevotrabajador);
    }
    public void listarTrabajador() {
        System.out.println("La lista de trabajadores es: ");
        for (int i=0; i<listatrabajador.size(); i++){
            Trabajador t = listatrabajador.get(i);
            t.verDatos();
            if(t instanceof Empleado){
                Empleado x = (Empleado)t;
                x.CalcularSueldoMensual(5);
            }else if(t instanceof Obrero){
                Obrero y = (Obrero)t;
                y.CalcularJornalMensual(25);
            }
        }
    }
}
