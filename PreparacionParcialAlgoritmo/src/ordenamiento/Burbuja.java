/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento;

/**
 *
 * @author mauro
 */
public class Burbuja {

    private static void burbujaSort(int[] v) {
        int ultimo = v.length - 1;
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < ultimo; j++) {
                if (v[j] > v[j + 1]) {
                    int aux = v[j + 1];
                    v[j + 1] = v[j];
                    v[j] = aux;
                }
            }
            ultimo = ultimo - 1;
        }
    }
}
