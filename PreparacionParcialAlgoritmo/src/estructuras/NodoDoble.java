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
public class  NodoDoble<T extends Comparable<T>> extends NodoGenerico{
     private T dato;
    private NodoDoble<T> siguiente;
    private NodoDoble<T> anterior;
 
    private int idNodoDoble;

    public NodoDoble(T t) {
        this.dato = t;
        this.siguiente = null;
        this.anterior = null;       
    }

    public int getId() {
        return idNodoDoble;
    }

    public void setId(int id) {
        this.idNodoDoble = id;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoDoble<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble<T> siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDoble<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble<T> anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        String text = "Nodo { dato = " + getDato().toString();
        if (getSiguiente() != null) {
            text += ", siguiente = {" + getSiguiente().getDato().toString() + " }";
        }
        if (getAnterior() != null) {
            text += ", anterior = " + getAnterior().getDato().toString() + " }";
        }
        text += " }\n";
        return text;
    }
}
