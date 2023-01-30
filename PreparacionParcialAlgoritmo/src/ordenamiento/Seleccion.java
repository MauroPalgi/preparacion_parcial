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
 */
public class Seleccion {

    public void Ordenamiento(int[] vector) {
        int largo = vector.length;
        int index = 1;
        Utils.mostrarVector(vector);
        for (int i = index; i < largo; i++) {
            if (vector[i] < vector[i - 1]) {
                int aux = vector[i - 1];
                vector[i - 1] = vector[i];
                vector[i] = aux;
            }
            if (i == largo - 1) {
                i = 0;
                largo -= 1;
            }
        }
        Utils.mostrarVector(vector);
    }
}
