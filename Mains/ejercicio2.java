/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mains;

import Entidades.Punto;
import Servicios.PuntoServicio;

public class ejercicio2 {

    public static void main(String[] args) {
        
        PuntoServicio ps1 = new PuntoServicio();
        Punto p1 = ps1.crearPunto();
        
        PuntoServicio ps2 = new PuntoServicio();
        Punto p2 = ps2.crearPunto();
        
        ps1.mostrarPuntos(p1, p2);
        
        int distancia = ps1.calcularDistancia(p1, p2);
        System.out.println("La distancia entre ambos puntos es: " +distancia);
    }
    
}
