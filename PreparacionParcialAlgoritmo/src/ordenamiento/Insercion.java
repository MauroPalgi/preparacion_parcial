/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento;
import Utils.*;
/**
 *
 * @author mauro
 */
public class Insercion {

    public static void insercionSort(int[] v) {

        for (int i = 1; i < v.length; i++) {
            int j = i;
            Utils.mostrarVector(v);
            while (j > 0 && v[j] < v[j - 1]) {
                int aux = v[j];
                v[j] = v[j - 1];
                v[j - 1] = aux;
                j--;
            }
        }
    }
}
