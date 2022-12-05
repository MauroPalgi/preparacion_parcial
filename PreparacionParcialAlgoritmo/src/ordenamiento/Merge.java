/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento;

/**
 *
 * @author mauro
 */
public class Merge {

    public static void mergeSort(int[] lista, int largo) {
        if (largo > 1) {
            int med = largo / 2;
            int largoVecIzq = med;
            int largoVecDer = largo - med;
            int vecIzq[] = new int[largoVecIzq];
            int vecDer[] = new int[largoVecDer];
            // Se cargan ambos vectores mitades
            for (int i = 0; i < largoVecIzq; i++) {
                vecIzq[i] = lista[i];
            }
            for (int j = 0; j < largoVecDer; j++) {
                vecDer[j] = lista[j + med];
            }

            mergeSort(vecIzq, largoVecIzq);
            mergeSort(vecDer, largoVecDer);
            merge(lista, vecIzq, vecDer);
        }
    }

    public static void merge(int[] lista3, int[] lista1, int[] lista2) {
        int largo1 = lista1.length;
        int largo2 = lista2.length;
        int i = 0; //recorre lista1
        int j = 0; //recorre lista2
        int k = 0;//para armar el vector intercalado lista3
        while (i < largo1 || j < largo2) {
            if (i < largo1 && j < largo2) {
                if (lista1[i] < lista2[j]) {
                    lista3[k] = lista1[i];
                    i++;
                } else {
                    lista3[k] = lista2[j];
                    j++;
                }
                k++;
            } else { // uno de los dos vectores se terminó
                if (i < largo1) {
                    lista3[k] = lista1[i];
                    i++;
                } else {

                    lista3[k] = lista2[j];
                    j++;
                }

            }
        }
    }
}
