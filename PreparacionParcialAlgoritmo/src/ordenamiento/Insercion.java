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
public class Insercion {

    public void Ordenamiento(int[] vector) {

        // arranca en uno 
        // se fija si n + 1 hasta 0 si valor es es menor
        // si es menor se fija en el anterior 
        // si es mayor lo sustituye
        int largo = vector.length;
        Utils.mostrarVector(vector);
        for (int i = 1; i < largo; i++) {
            int j = i;
            System.out.println("exterior " + vector[i]);
            while (j > 0 && vector[j] < vector[j - 1]) {
                int aux = vector[j];
                vector[j] = vector[j - 1];
                vector[j - 1] = aux;
                j--;
            }
        }
        System.out.println("despues ");
        Utils.mostrarVector(vector);

    }

}
