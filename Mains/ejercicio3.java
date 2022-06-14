/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mains;

import Entidades.Raiz;
import Servicios.RaizServicio;

public class ejercicio3 {

    public static void main(String[] args) {
        
        RaizServicio rs1 = new RaizServicio();
        Raiz r1 = rs1.crearRaiz();
        
        rs1.mostrarValores(r1);
        
        double discriminante = rs1.calcularDiscriminante(r1);
        System.out.println("Valor del discriminante: " +discriminante);
        
        boolean tiene2 = rs1.tieneRaices(discriminante);
        boolean tiene1 = rs1.tieneRaiz(discriminante);
        
        rs1.obtenerRaices(r1, tiene2, discriminante);
        rs1.obtenerRaiz(r1, tiene1, discriminante);
        
    }
    
}
