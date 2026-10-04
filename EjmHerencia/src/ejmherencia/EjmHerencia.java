/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejmherencia;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author UCF20411
 */
public class EjmHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        /*String cad;
        Trabajador t = new Trabajador();
        t.verDatos();
        
        System.out.println("Ingrese tipo de documento: ");
        cad = sc.nextLine();
        t.setTipo_doc(cad);
        
        System.out.println("Ingrese nro de documento: ");
        cad = sc.nextLine();
        t.setNro_doc(cad);
        
        System.out.println("Ingrese apellido paterno: ");
        cad = sc.nextLine();
        t.setPaterno(cad);
        
        System.out.println("Ingrese apellido materno: ");
        cad = sc.nextLine();
        t.setMaterno(cad);
        
        System.out.println("Ingrese nombre: ");
        cad = sc.nextLine();
        t.setNombre(cad);
        
        System.out.println("Ingrese fecha de nacimiento: ");
        cad = sc.nextLine();
        t.setFecha_nac(LocalDate.parse(cad));
        t.verDatos();*/
        
        Obrero o1 = new Obrero("DNI");
        o1.verDatos();
        o1.setJornal(71.5);
        //o1.setTipo_doc("DNI");
        o1.setNro_doc("75943628");
        o1.setNombre("Chapli");
        o1.setPaterno("Ruiz");
        o1.setMaterno("Lopez");
        o1.setFecha_nac(LocalDate.parse("2001-11-10"));
        o1.verDatos();
        
        Empleado e1 = new Empleado("CE");
        e1.verDatos();
        e1.setSueldo(2500);
        //e1.setTipo_doc("DNI");
        e1.setNro_doc("61007425");
        e1.setNombre("Jorge");
        e1.setPaterno("Perez");
        e1.setMaterno("Gomez");
        e1.setFecha_nac(LocalDate.parse("2007-04-01"));
        e1.verDatos();
        
        TrabajadorController controla = new TrabajadorController();
        controla.agregarTrabajador(o1);
        controla.agregarTrabajador(e1);
        
        controla.listarTrabajador();
    }
    
}
