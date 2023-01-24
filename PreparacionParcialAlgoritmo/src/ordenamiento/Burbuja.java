/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

import Utils.*;

/**
 *
 * @author maurp
 * @param <T>
 */
public class Burbuja {

    public void Ordenamiento(int[] vector) {
        int largo = vector.length;
        for (int i = 0; i < largo; i++) {
            boolean ordenado = false;
            for (int j = i + 1; j < largo; j++) {
                if (vector[i] > vector[j] && !ordenado) {
                    System.out.println("Entre");
                    int aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;
                } 
            }
            Utils.mostrarVector(vector);
        }

    }

}
