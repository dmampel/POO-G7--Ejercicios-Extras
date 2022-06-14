/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

public class Ahorcado {

    private String palabraABuscar;
    private int letrasEncontradas;
    private int maximoJugadas;

    public Ahorcado() {
    }

    public Ahorcado(String palabraABuscar, int letrasEncontradas, int maximoJugadas) {
        this.palabraABuscar = palabraABuscar;
        this.letrasEncontradas = letrasEncontradas;
        this.maximoJugadas = maximoJugadas;
    }

    public String getPalabraABuscar() {
        return palabraABuscar;
    }

    public void setPalabraABuscar(String palabraABuscar) {
        this.palabraABuscar = palabraABuscar;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getMaximoJugadas() {
        return maximoJugadas;
    }

    public void setMaximoJugadas(int maximoJugadas) {
        this.maximoJugadas = maximoJugadas;
    }

}
