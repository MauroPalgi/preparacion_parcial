/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

/**
 *
 * @author mauro
 */
public class NodoGenerico {

    final int idNodo;
    static private int idGlobal = 0;

    public NodoGenerico() {
        this.idNodo = NodoGenerico.idGlobal;
        NodoGenerico.idGlobal++;
    }

}
