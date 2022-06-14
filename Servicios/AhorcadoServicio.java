/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

public class AhorcadoServicio {

    Scanner leer = new Scanner(System.in);

    public Ahorcado crearAhorcado() {

        Ahorcado j1 = new Ahorcado();
        System.out.println("Vamos a jugar al ahorcado.");
        System.out.println("Ingrese una palabra.");
        j1.setPalabraABuscar(leer.next());
        System.out.println("La cantidad de intentos la define el algoritmo.");

        int longitud = j1.getPalabraABuscar().length();
        j1.setLetrasEncontradas(0);
        j1.setMaximoJugadas(longitud * 2);

        return j1;
    }

    public void mostrarLongitud(Ahorcado j1) {
        int longitud = j1.getPalabraABuscar().length();
        System.out.println("La palabra es de " + longitud + " letras.");

    }

    public String pedirLetra() {

        String letra;

        System.out.println("Ingrese la letra.");
        letra = leer.next();

        return letra;
    }

    public int buscarLetra(Ahorcado j1, String letra) {

        int longitud = j1.getPalabraABuscar().length();
        int encontradas = j1.getLetrasEncontradas();
        int original = j1.getMaximoJugadas();
        int jugadas = j1.getMaximoJugadas();
        int cont;
        String[] vector = new String[longitud];

        for (cont = 0; cont < longitud; cont++) {
            vector[cont] = j1.getPalabraABuscar().substring(cont, cont + 1);

            if (letra.equals(vector[cont])) {
                encontradas = encontradas + 1;
                
            } else {
                jugadas = j1.getMaximoJugadas() - 1;
            }

        }

        System.out.println();

        j1.setLetrasEncontradas(encontradas);

        if (encontradas > 0 && jugadas == original) {
            System.out.println("Muy bien! La letra se encuentra en la palabra.");
            j1.setMaximoJugadas(original);
        } else {
            System.out.println("Oh no! La letra no está en la palabra.");
            j1.setMaximoJugadas(jugadas);
        }

        return encontradas;

    }

    public int mostrarInfo(Ahorcado j1) {

        System.out.println("Letras encontradas: " + j1.getLetrasEncontradas());

        System.out.println("Intentos restantes: " + j1.getMaximoJugadas());
        return j1.getMaximoJugadas();
    }

    public void llamarJuego(Ahorcado j1) {

        AhorcadoServicio js1 = new AhorcadoServicio();

        js1.mostrarLongitud(j1);
        int intentos = j1.getMaximoJugadas();
        System.out.println("Tienes " + intentos + " intentos.");
        System.out.println(".....");
        System.out.println("Muy bien, empecemos.");

        do {
            String letra = js1.pedirLetra();
            int encontradas = js1.buscarLetra(j1, letra);
            intentos = js1.mostrarInfo(j1);
            int longitud = j1.getPalabraABuscar().length();
            if (encontradas == longitud) {
                System.out.println("Felicitaciones! Encontraste la palabra.");
                break;
            }

        } while (intentos > 0);

        if (intentos == 0) {
            System.out.println("Oh no, te quedaste sin intentos.");
        }

    }

}
