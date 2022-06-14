/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

public class JuegoMes {
    
    private String mesSecreto;
    private String respuesta;

    public JuegoMes() {
    }

    public JuegoMes( String mesSecreto, String respuesta) {
        
        this.mesSecreto = mesSecreto;
        this.respuesta = respuesta;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    
    
    
}
