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

        int[] vector = new int[]{35, 7, 67, 52, 31, 28};
        System.out.println(Buscoposminimo(vector, 1, 5));
        System.out.println(Buscoposminimo(vector, 2, 5));
        Pila<Integer> pilaInt = new Pila<>(5);
        System.out.println(pilaInt.toString());
        pilaInt.apilar(5);
        pilaInt.apilar(3);
        pilaInt.apilar(6);
        pilaInt.apilar(8);
        pilaInt.desapilar();
        pilaInt.desapilar();
        pilaInt.desapilar();
        pilaInt.desapilar();               
        System.out.println(pilaInt.toString());

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
    static public void Reemplazar(Pila P, int nuevo, int viejo) {
        
    }
}
