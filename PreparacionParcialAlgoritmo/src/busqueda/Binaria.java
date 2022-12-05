/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busqueda;

/**
 *
 * @author mauro
 */
public class Binaria {
      public static boolean busquedaBinaria(int[] v, int dato, int desde, int hasta) {
        boolean encontre = false;
        if (desde > hasta) {
            return false;
        }
        int med = (desde + hasta) / 2;
        if (v[med] == dato) {
            encontre = true;
        } else {
            if (v[med] < dato) {
                encontre = busquedaBinaria(v, dato, med + 1, hasta);
            } else {
                encontre = busquedaBinaria(v, dato, desde, med - 1);
            }
        }
        return encontre;
    }
}
