/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andet
 */
public class NodoDoble {
    private Prioridad dato;
    private NodoDoble sig,ant;
    
    public NodoDoble(Prioridad d){
        dato=d;
        sig=null;
        ant=null;
    }

    public NodoDoble() {
    }

    public Prioridad getDato() {
        return dato;
    }

    public void setDato(Prioridad dato) {
        this.dato = dato;
    }

    public NodoDoble getSig() {
        return sig;
    }

    public void setSig(NodoDoble sig) {
        this.sig = sig;
    }

    public NodoDoble getAnt() {
        return ant;
    }

    public void setAnt(NodoDoble ant) {
        this.ant = ant;
    }
}
