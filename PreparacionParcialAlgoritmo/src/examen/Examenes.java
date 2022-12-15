/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import estructuras.*;

/**
 *
 * @author mauro
 */
public class Examenes {

    public static void main(String[] args) {

        int[] vector = new int[]{1, 5, 34, 4, 70, 80, 8, 100};
        
//        Pila<Integer> pilaInt = new Pila<>(5);
        //System.out.println(pilaInt.toString());
//        pilaInt.apilar(5);
//        pilaInt.apilar(3);
//        pilaInt.apilar(2);
//        pilaInt.apilar(6);
//        pilaInt.apilar(8);
        // Reemplazar(pilaInt, 69, 5);
        ListaDoble<Integer> listaInt = new ListaDoble<>();
        listaInt.agregarOrd(-1);
        listaInt.agregarOrd(1);
        listaInt.agregarOrd(2);
        listaInt.agregarOrd(3);
        listaInt.agregarOrd(4);
        listaInt.agregarOrd(5);
        // System.out.println(suma_vec(vector, vector.length));
        System.out.println(algoritmo(vector, 2, 5));

//        System.out.println(listaInt.toString());
//        mostrarMenorEIgual(listaInt.getInicio(), 3);
        // listaInt.mostrar();
        // System.out.println(busqueda(listaInt, 3, 2));
        // eliminarMayores(pilaInt, 4);        
        // int[][] respuesta = sumaFilas(3, 3, matrizInt);
//        for (int i = 0; i < respuesta.length; i++) {
//            for (int j = 0; j < respuesta[i].length; j++) {
//                System.out.println("celdas - " + respuesta[i][j]);
//            }
//        }
//        System.out.println("resultado = " + sumaMultiplos(vector, 0));
//        int[] vector2 = new int[]{1, 1, 4, 3, 95, 5};
//        System.out.println(noValeCopiar(vector2, 0, 5));
    }

    /*    
    EJERCICIO 2 - 03082022
    
    Implemente un método de ordenamiento ascendente (menor a mayor) utilizando el método 
    auxiliar:
    
    int Buscoposminimo(int v[],posdesde,poshasta)

    que retorna la posición donde se encuentra el valor mínimo del vector entre 2 posiciones 
    dadas como se muestra en el siguiente ejemplo
    
    Ejemplo: para el vector dado en el ejercicio 1 (35 – 7 – 67 – 52 – 31 - 28
    
    Buscoposminimo(int v[],0,5) retorna 1 (posición del 7, mínimo valor)
    Buscoposminimo(int v[],2,5) retorna 5 (posición del 28, mínimo valor)
     */
    static public int Buscoposminimo(int vector[], int posdesde, int poshasta) {
        int minimoValor = Integer.MAX_VALUE;
        int minimoPos = -1;
        for (int i = posdesde; i <= poshasta; i++) {
            if (minimoValor > vector[i]) {
                minimoValor = vector[i];
                minimoPos = i;

            }
        }
        return minimoPos;
    }

    /*
    EJERCICIO 4 - 03082022

        Escribir una función: 
        // el método debe ser eficiente
        void Reemplazar(pila P,int nuevo,int viejo)
        que tenga como argumentos una pila P de enteros un valor int: nuevo y y un valor int
        viejo de forma que, si el viejo valor aparece en algún lugar de la pila, sea reemplazado 
        por el nuevo.
        
    Nota: se permite utilizar una pila auxiliar y se asume disponibles los métodos:
        • pop() , 
        • push() 
        • tope() 
        • esvacia() 
        • esllena()
     */
    static public void Reemplazar(Pila pila, int nuevo, int viejo) {
        NodoPila nodoAuxiliar = pila.cima();
        Pila<Integer> pilaAuxiliar = new Pila<>(pila.elementos());
        Pila<Integer> pilaRespuesta = new Pila<>(pila.elementos());

        int largoPila = pila.elementos();
        for (int i = 0; i < largoPila; i++) {
            int valorNodo = (Integer) nodoAuxiliar.getDato();
            pila.desapilar();
            pilaAuxiliar.apilar(valorNodo);
            nodoAuxiliar = nodoAuxiliar.getSiguiente();
        }
        nodoAuxiliar = pilaAuxiliar.cima();
        for (int i = 0; i < largoPila; i++) {
            int valorNodo = (Integer) nodoAuxiliar.getDato();
            pilaAuxiliar.desapilar();
            if (valorNodo == viejo) {
                valorNodo = nuevo;
            }
            pilaRespuesta.apilar(valorNodo);
            nodoAuxiliar = nodoAuxiliar.getSiguiente();

        }
        System.out.println("Nueva Pila: " + pilaRespuesta.toString());

    }

    /*
        EJERCICIO 3 - 01052022
        Dado una lista simplemente encadenada, implementar un método recursivo que permita 
        indicar si se encuentra un elemento dado, dentro de una cantidad tope máxima de 
        elementos indicada desde su inicio.
        
        Ej: Si se buscara el número 5 con un tope máximo de 4 en la lista:
        retornaría verdadero ya que el número 5 se encuentra en el lugar 3, siendo el tope máximo 
        4. Si se buscara el número 9 retornaría falso, ya que se encuentra en el lugar 5 (lugar 
        superior al tope). Si se buscara el 8 retornaría falso dado que no está el número.
        Firma a utilizar: boolean busqueda(Nodo lista, int númeroBuscado, int tope
     */
    static public boolean busqueda(ListaDoble lista, int numeroBuscado, int tope) {
        NodoDoble<Integer> nodoAuxiliar = lista.getInicio();
        int resultado = posicionNodoLista(nodoAuxiliar, numeroBuscado, tope);
        return resultado > 0;
    }

    static public int posicionNodoLista(NodoDoble nodo, int numeroBuscado, int tope) {
        if ((int) nodo.getDato() == numeroBuscado) {
            return tope;
        }
        if (tope == 0) {
            return -1;
        }
        return posicionNodoLista(nodo.getSiguiente(), numeroBuscado, tope - 1);
    }

    /*
    EJERCICIO 4 - 01052022
    Escribir una función que permita eliminar de una pila todos los elementos mayores a un 
    valor indicado:
    Firma a utilizar: boolean eliminarMayores(pila P, int valor)
     */
    static public boolean eliminarMayores(Pila pila, int valor) {

        if (!pila.esVacia()) {
            while ((Integer) pila.cima().getDato() > valor) {
                pila.desapilar();
            }
            NodoPila<Integer> nodoAuxiliar = pila.cima();
            while (nodoAuxiliar != null) {
                if (nodoAuxiliar.getSiguiente() != null && nodoAuxiliar.getSiguiente().getDato() > valor) {
                    nodoAuxiliar.setSiguiente(nodoAuxiliar.getSiguiente().getSiguiente());
                }
                nodoAuxiliar = nodoAuxiliar.getSiguiente();
            }
        }

        System.out.println(pila.toString());

        return false;
    }

    /*
    EJERCICIO 5 - 01052022
    
    Implementar un algoritmo que retorne una nueva matriz - de igual cantidad de filas, pero 
    una columna más que la original - con la sumatoria de cada fila de la matriz original: 
    Firma a utilizar: int [][] mat sumaFilas (int largFfila, int largoCol, int[][] m)
     */
    static public int[][] sumaFilas(int largFfila, int largoCol, int[][] matriz) {
        int[][] matrizRespuesta = new int[largFfila][largoCol + 1];

        for (int i = 0; i < largFfila; i++) {
            int suma = 0;
            for (int j = 0; j < largoCol; j++) {
                int celdaActual = matriz[i][j];
                suma += celdaActual;
                matrizRespuesta[i][j] = celdaActual;
            }
            matrizRespuesta[i][matrizRespuesta[i].length - 1] = suma;
        }

        return matrizRespuesta;
    }

    /*
    EJERCIOCIO 2 - 28102022
    
    Realizar un algoritmo recursivo que, dado un vector de enteros retorne la suma de todos aquellos valores que 
    son múltiplos de dos.
    Firma sugerida:
    public int sumaMultiplos (int lista[], int pos)
     */
    static public int sumaMultiplos(int[] lista, int pos) {
        if (lista.length == pos) {
            return 0;
        }
        if (lista[pos] % 2 == 0) {
            return lista[pos] + sumaMultiplos(lista, pos + 1);
        } else {
            return sumaMultiplos(lista, pos + 1);
        }
    }

    /*
    EJERCICIO 1 - B - 03122019
    
    Implemente un método RECURSIVO que dado un vector v, una posición desde y una posición 
    hasta retorne la suma de los elementos que no tengan el mismo valor que su posición en el vector. 
    
    Firma: public int noValeCopiar(int[] v, int desde, int hasta)
    Tomando desde = 0, hasta = 5, k = 16 y dado el siguiente vector: 
    El resultado es 100, ya que los elementos en la posición 1, 3 y 5 valen 1, 3 y 5 
    respectivamente, mientras que el primer 1, 4 y 95 están en las posiciones 0, 2 y 4.    
     */
    static public int noValeCopiar(int[] vector, int desde, int hasta) {
        if (desde > hasta) {
            return 0;
        }
        if (vector[desde] != desde) {
            return vector[desde] + noValeCopiar(vector, desde + 1, hasta);
        } else {
            return noValeCopiar(vector, desde + 1, hasta);
        }
    }

    /*
    Realizar un algoritmo recursivo que, dado un entero, muestre todos los números menores e iguales al 
    mismo. Ej: para la lista dispuesta como ejemplo, si el número dado fuera 76, se debería mostrar: 
    34-45-70-76-76
    Firma: void mostrarMenorEIgual(Nodo lista, int num) (5 ptos)
     */
    static public void mostrarMenorEIgual(NodoDoble lista, int num) {
        if (lista == null) {
            return;
        }

        if ((Integer) lista.getDato() <= num) {
            System.out.println(lista.getDato().toString());

        }

        mostrarMenorEIgual(lista.getSiguiente(), num);
    }

    /*
    Ejercicio 4 (10 ptos)
    Implemente un algoritmo recursivo que sume los elementos de un vector 
    Utilizar ls siguiente firma: int suma_vec(int v [], int n) // n es la cantidad de elementos del vector
     */
    static public int suma_vec(int v[], int n) {
        if (n == 0) {
            return 0;
        }

        int pos = v.length - n;
        return v[pos] + suma_vec(v, n - 1);
    }

    /*
    Ejercicio 4 (15 ptos)
    
    Dado el siguiente vector:
    
    a) Implementar un algoritmo recursivo que, dado una posición desde y una posición hasta, retorne la suma 
    de los números que se encuentran entre estas dos posiciones (inclusive) (10 puntos)
    Vector v =1 5 34 4 70 80 8 100

    Firma: private int algoritmo(int[] v, int desde, int hasta) 
    Ej; con desde: 2 y hasta:5, el retorno debería ser: 113
     */
    static public int algoritmo(int[] v, int desde, int hasta) {        
        if (desde < hasta) {
            return 0;
        }
        return v[desde] + algoritmo(v, desde + 1, hasta);
    }

    /*
    Ejercicio 4 (15 ptos)
    
    Dado el siguiente vector ordenado en forma ascendente, 
    
    a) Implementar un algoritmo recursivo de búsqueda por bipartición utilizando la técnica divide y vencerás. 
    (10 puntos)
    Vector v=
    1 5 34 45 70 80 85 100
    Pre condición: el vector está ordenado, inicialmente parte con desde=0, hasta=v.length-1.
    Firma: private static boolean algoritmo(int[] v, int desde, int hasta, int num) 
    
    b) Realizar el diagrama de llamadas para Llamada inicial: algoritmo(v,0,7,70) (5 puntos)
    */
}
