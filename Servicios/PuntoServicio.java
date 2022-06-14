/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Punto;
import java.util.Scanner;

public class PuntoServicio {
    Scanner leer = new Scanner(System.in);
   
    public Punto crearPunto(){
        
        Punto p1 = new Punto();
        
        System.out.println("Vamos a crear un punto.");
        System.out.println("Inserte el valor en X.");
        p1.setX(leer.nextInt());
        System.out.println("Inserte el valor en Y.");
        p1.setY(leer.nextInt());
        
        
        return p1;
        
    }
    
    public void mostrarPuntos(Punto p1, Punto p2){
        
        System.out.println("Punto 1: (" +p1.getX()+ "," +p1.getY()+ ")");
        System.out.println("Punto 2: (" +p2.getX()+ "," +p2.getY()+ ")");
    }
    
    public int calcularDistancia(Punto p1, Punto p2){
        
        int distancia;
        distancia = (int)Math.sqrt((int)Math.pow(p2.getX() - p1.getX(), 2) + (int)Math.pow(p2.getY() - p1.getY(), 2));
        
        return distancia;
    }
    
    
    
}
