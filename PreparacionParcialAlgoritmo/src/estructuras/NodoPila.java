/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

/**
 *
 * @author mauro
 * @param <T>
 */
public class NodoPila<T extends Comparable<T>> extends NodoGenerico {

    T dato;
    NodoPila<T> siguiente;

    public NodoPila(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoPila<T> getSiguiente() {
        return siguiente;
    }

    @Override
    public String toString() {
        return "NodoPila{" + "dato=" + dato + ", siguiente=" + siguiente + '}';
    }

    public void setSiguiente(NodoPila<T> siguiente) {
        this.siguiente = siguiente;
    }
}
