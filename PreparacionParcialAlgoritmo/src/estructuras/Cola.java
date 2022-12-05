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
public class Cola<T extends Comparable<T>> {

    int maximo;         // el maximo aceptado en la pila
    int cantelementos; //la cantidad de elementos que tiene la pila 
    NodoCola<T> primero;
    NodoCola<T> ultimo;

    public Cola(int maximo) {
        this.maximo = maximo;
        this.cantelementos = 0;
        this.primero = null;
        this.ultimo = null;
    }

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public int getCantelementos() {
        return cantelementos;
    }

    public void setCantelementos(int cantelementos) {
        this.cantelementos = cantelementos;
    }

    public NodoCola getPrimero() {
        return primero;
    }

    public void setPrimero(NodoCola primero) {
        this.primero = primero;
    }

    public NodoCola getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoCola ultimo) {
        this.ultimo = ultimo;
    }

    public void enColar(T dato) {
        NodoCola<T> nuevoNodo = new NodoCola<>(dato);

        if (this.cantelementos + 1 < this.maximo) {
            if (this.cantelementos == 0) {
                this.primero = nuevoNodo;
                this.ultimo = nuevoNodo;
            } else {
                NodoCola<T> nodoAux = this.getPrimero();
                nuevoNodo.setSiguiente(nodoAux);
                this.setPrimero(nuevoNodo);
            }
            this.cantelementos++;
            System.out.println("Elemento agregado");
        } else {
            System.out.println("Maximo alcanzado");
        }

    }

    public NodoCola<T> desenColar() {
        NodoCola<T> nodoAux = this.getPrimero();
        NodoCola<T> nodoPrev = null;
        NodoCola<T> nodoUltimo = null;
        if (this.esVacia()) {
            return null;
        }

        if (this.cantelementos == 1) {

        }

        while (nodoAux != null) {
            if (nodoAux.equals(this.getUltimo())) {
                nodoPrev = nodoAux;
                nodoUltimo = this.getUltimo();
                nodoPrev.setSiguiente(null);
                this.setUltimo(nodoUltimo);
            }
            nodoAux = nodoAux.getSiguiente();
        }

        return this.getUltimo();
    }

    public boolean esVacia() {
        return this.cantelementos == 0;
    }

    public boolean esllena() {
        return this.cantelementos == this.maximo;
    }

    public int cantelementos() {
        return this.getCantelementos();
    }

    public NodoCola<T> frente() {
        return this.getUltimo();
    }

}
