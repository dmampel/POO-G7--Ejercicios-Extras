/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Raiz;
import java.util.Scanner;

public class RaizServicio {
    Scanner leer = new Scanner(System.in);
    
    public Raiz crearRaiz(){
        
        Raiz r1 = new Raiz();
        System.out.println("Vamos a crear y resolver una ecuación de 2do grado.");
        System.out.println("Inserte el valor de A.");
        r1.setA(leer.nextInt());
        System.out.println("Inserte el valor de B.");
        r1.setB(leer.nextInt());
        System.out.println("Inserte el valor de C.");
        r1.setC(leer.nextInt());
        
        return r1;
    }
    
    public void mostrarValores(Raiz r1){
        
        System.out.println("A: " +r1.getA());
        System.out.println("B: " +r1.getB());
        System.out.println("C: " +r1.getC());
    }
    
    public double calcularDiscriminante(Raiz r1){
        
        double discriminante;
        discriminante = Math.pow(r1.getB(), 2) - (4 * r1.getA() * r1.getC());
        return discriminante;
    }
    
    public boolean tieneRaices(double discriminante){
        
        boolean tieneRaices;
        
        if (discriminante > 0){
            tieneRaices = true;
        }else {
            tieneRaices = false;
        }
        return tieneRaices;
    }
    
    public boolean tieneRaiz(double discriminante){
        
        boolean tieneRaiz;
        
        if (discriminante == 0){
            tieneRaiz = true;
        }else {
            tieneRaiz = false;
        }
        
        return tieneRaiz;
    }
    
    public void obtenerRaices (Raiz r1, boolean tiene2, double discriminante){
        
        double solucion1;
        double solucion2;
        
        if (tiene2 == true){
           
            System.out.println("La ecuación tiene dos soluciones.");
            
            solucion1 = (-r1.getB() + Math.sqrt(discriminante) / (2 * r1.getA()));
            // (-b±√((b^2)-(4*a*c)))/(2*a)        
            System.out.println("Solución 1: " +solucion1);     
            
            solucion2 = (-r1.getB() - Math.sqrt(discriminante) / (2 * r1.getA()));
            System.out.println("Solución 2: " +solucion2);     
        
        }else{
            System.out.println("La ecuación no tiene solución.");
        }
        
    }
    
    public void obtenerRaiz (Raiz r1, boolean tiene1, double discriminante){
        
        double solucion;
        
        if (tiene1 == true){
            System.out.println("La ecuación tiene una única solución.");
            solucion = (-r1.getB() + Math.sqrt(discriminante) / (2 * r1.getA()));
            System.out.println("Solucion: " +solucion); 
        }
    }
}
