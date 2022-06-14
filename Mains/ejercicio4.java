/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mains;

import Entidades.NIF;
import Servicios.NIFServicio;

public class ejercicio4 {

    public static void main(String[] args) {
        
        NIFServicio nifS1 = new NIFServicio();
        NIF nif1 = nifS1.crearNif();
        
        int resultado = nifS1.calcularNif(nif1);
        
        String letra = nifS1.asignarLetra(nif1, resultado);
        
        nifS1.mostrarNif(nif1, letra);
    
    }
    
}
