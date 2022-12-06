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
public class Pila<T extends Comparable<T>> {

    int maximo;         // el maximo aceptado en la pila
    int cantelementos; //la cantidad de elementos que tiene la pila 
    NodoPila<T> primero;

    public Pila(int maximo) {
        this.maximo = maximo;
        this.cantelementos = 0;
        this.primero = null;
    }

    public void apilar(T dato) { // ESTO ES PUSH
        if (this.cantelementos + 1 <= this.maximo) {
            NodoPila<T> nuevoNodo = new NodoPila<>(dato);
            nuevoNodo.setSiguiente(this.primero);
            this.primero = nuevoNodo;
            this.cantelementos++;
        }
    }

    public NodoPila<T> desapilar() { // ESTO ES POP
        NodoPila<T> auxiliar = this.primero;
        this.primero = auxiliar.getSiguiente();
        this.cantelementos--;
        return auxiliar;
    }

    public boolean esVacia() {
        return this.cantelementos == 0;
    }

    public boolean esllena() {
        return this.cantelementos == this.maximo;

    }

    public NodoPila<T> cima() { // TOP
        return this.primero;
    }

    public int elementos() {
        return this.cantelementos;
    }

    @Override
    public String toString() {
        String texto = "Pila{" + "maximo=" + maximo + ", \ncantelementos=" + cantelementos + (this.cima() != null ? ", \ncima=" + this.cima().toString() : "");
        if (esVacia()) {
            texto += "Pila vacia";
        } else {
            NodoPila<T> nodoAuxiliar = this.primero;
            texto += "\nNodos=[";
            while (nodoAuxiliar != null) {
                texto += nodoAuxiliar.getDato().toString() + ",";
                nodoAuxiliar = nodoAuxiliar.getSiguiente();
            }
            texto += "]";

        }
        return texto + "\n}";
    }

}
