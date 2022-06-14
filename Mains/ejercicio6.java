/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mains;

import Entidades.Ahorcado;
import Servicios.AhorcadoServicio;

public class ejercicio6 {

    public static void main(String[] args) {

        AhorcadoServicio js1 = new AhorcadoServicio();
        Ahorcado j1 = js1.crearAhorcado();
        
        js1.llamarJuego(j1);
    }

}
