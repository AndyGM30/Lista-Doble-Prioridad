/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andet
 */
public class ListaDoble {

    protected NodoDoble ini, fin;

    public ListaDoble() {
        ini = fin = null;
    }

    public boolean insertar(Prioridad dato) {
        NodoDoble n = new NodoDoble(dato);
        if (n == null) {
            return false;
        }
        if (ini == null) {
            ini = fin = n;
            return true;
        }
        
        NodoDoble i = ini;
        if (ini == fin) {
            if (n.getDato().getNivel() > ini.getDato().getNivel()) {
                n.setSig(ini);
                ini = n;
                return true;
            } else {
                if (n.getDato().getNivel() < ini.getDato().getNivel()) {
                    fin.setSig(n);
                    n.setAnt(fin);
                    fin = n;
                    return true;
                }
            }//else

        } else {
            for (; i != fin; i = i.getSig()) {

                if (n.getDato().getNivel() > ini.getDato().getNivel()) {
                    ini.setAnt(n);
                    n.setSig(ini);
                    ini = n;
                    return true;
                }
                if (n.getDato().getNivel() > i.getSig().getDato().getNivel()) {
                    n.setSig(i.getSig());
                    n.setAnt(i);
                    i.getSig().setAnt(n);
                    i.setSig(n);
                    return true;
                }
            }//for
            if (i == fin) {
                fin.setSig(n);
                n.setAnt(fin);
                fin = n;
                return true;
            }
        }//else
        return false;
    }

    public boolean eliminar() {
        if (fin == null) {
            return false;
        }
        if (ini == fin) {
            ini = fin = null;
            return true;
        }
        ini = ini.getSig();
        ini.getAnt().setSig(null);
        ini.setAnt(fin);
        return true;
    }

    public boolean hayUnSoloNodo() {
        ini = fin = null;
        return true;
    }

    public boolean hayListaDobleVacia() {
        return ini == null && fin == null;
    }

    public NodoDoble getIni() {
        return ini;
    }
}
