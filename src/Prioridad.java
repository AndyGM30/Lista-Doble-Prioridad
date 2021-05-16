/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andet
 */
public class Prioridad {
    public char dato;
    public int nivel;
    
    public Prioridad(char dato, int nivel) {
        this.dato = dato;
        this.nivel = nivel;
    }

    public Prioridad() {
    }

    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return dato + " N" + nivel;
    }  
}
