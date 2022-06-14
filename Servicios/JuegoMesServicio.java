/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.JuegoMes;
import java.util.Scanner;

public class JuegoMesServicio {

    Scanner leer = new Scanner(System.in);

    public JuegoMes crearJuego() {

        JuegoMes j1 = new JuegoMes();

        System.out.println("Vamos a jugar a un juego.");
        System.out.println("Tenes que adivinar el mes secreto.");
        System.out.println("Ingresá el mes que te parezca y veamos si adivinaste.");
        j1.setRespuesta(leer.next());

        String[] mes = new String[12];
        mes[0] = "enero";
        mes[1] = "febrero";
        mes[2] = "marzo";
        mes[3] = "abril";
        mes[4] = "mayo";
        mes[5] = "junio";
        mes[6] = "julio";
        mes[7] = "agosto";
        mes[8] = "septiembre";
        mes[9] = "octubre";
        mes[10] = "noviembre";
        mes[11] = "diciembre";

        j1.setMesSecreto(mes[4]);
        boolean flag;
        do {
            if (j1.getRespuesta().equals(j1.getMesSecreto())) {
                flag = true;
                System.out.println("Felicitaciones! Adivinasate.");
            } else {
                flag = false;
                System.out.println("Ops, no adivinaste. Podes volver a intentarlo!");
                j1.setRespuesta(leer.next());
            }

        } while (flag == false);

        return j1;

    }
}
