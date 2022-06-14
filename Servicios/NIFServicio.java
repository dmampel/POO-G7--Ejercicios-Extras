/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.NIF;
import java.util.Scanner;

public class NIFServicio {
    Scanner leer = new Scanner(System.in);
    
    public NIF crearNif(){
        
        NIF nif1 = new NIF();
        
        System.out.println("Ingrese su número de documento.");
        nif1.setDni(leer.nextInt());
        System.out.println("Muchas gracias.");
        
        return nif1;
    }
    
    public int calcularNif(NIF nif1){
        
        int resultado;
        resultado = nif1.getDni() % 23;
        
        return resultado;
    }
    
    public String asignarLetra (NIF nif1, int resultado){
        
        String[] vector = new String[23];
        int cont;

        switch (resultado) {
            case 0:
                vector[0] = "T";
                break;
            case 1:
                vector[1] = "R";
                break;
            case 2:
                vector[2] = "W";
                break;
            case 3:
                vector[3] = "A";
                break;
            case 4:
                vector[4] = "G";
                break;
            case 5:
                vector[5] = "M";
                break;
            case 6:
                vector[6] = "Y";
                break;
            case 7:
                vector[7] = "F";
                break;
            case 8:
                vector[8] = "P";
                break;
            case 9:
                vector[9] = "D";
                break;
            case 10:
                vector[10] = "X";
                break;
            case 11:
                vector[11] = "B";
                break;
            case 12:
                vector[12] = "N";
                break;
            case 13:
                vector[13] = "J";
                break;
            case 14:
                vector[14] = "Z";
                break;
            case 15:
                vector[15] = "S";
                break;
            case 16:
                vector[16] = "Q";
                break;
            case 17:
                vector[17] = "V";
                break;
            case 18:
                vector[18] = "H";
                break;
            case 19:
                vector[19] = "L";
                break;
            case 20:
                vector[20] = "C";
                break;
            case 21:
                vector[21] = "K";
                break;
            case 22:
                vector[22] = "E";
                break;
            default:
                System.out.println("Error.");
                break;
        }
    
        return vector[resultado];
    }
    
    public void mostrarNif(NIF nif1, String letra){
        
        System.out.println(nif1.getDni()+ "-" +letra);
        
    }
    
    
}
