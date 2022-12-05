/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento;

/**
 *
 * @author mauro
 */
public class Seleccion {

    private static int posMinimoDelVector(int[] v, int desde, int hasta) {
        int min = v[desde];
        int pos = desde;
        for (int i = desde; i <= hasta; i++) {
            if (v[i] < min) {
                min = v[i];
                pos = i;
            }
        }
        return pos;
    }

    private static void SelectionSort(int[] v, int desde, int hasta) {
        for (int i = desde; i < hasta; i++) {
            int posMin = posMinimoDelVector(v, i, hasta);
            int aux = v[i];
            v[i] = v[posMin];
            v[posMin] = aux;
        }
    }

    public static void selectionSort_doble(int v[]) {
        for (int i = 0, j = v.length - 1; i < j; i++, j--) {
            int pos_min = i;
            int min = v[i];
            int pos_max = i;
            int max = v[i];

            for (int k = i; k <= j; k++) {
                if (v[k] < min) {
                    min = v[k];
                    pos_min = k;
                }
                if (v[k] > max) {
                    max = v[k];
                    pos_max = k;
                }
            }

            int aux = v[i];
            v[i] = min;
            v[pos_min] = aux;

            if (v[pos_min] == max) {
                aux = v[j];
                v[j] = max;
                v[pos_min] = aux;
            } else {
                aux = v[j];
                v[j] = max;
                v[pos_max] = aux;
            }
        }
    }
    
    
     public static void selectionSort_ordenado (int v[])    {
    // Algoritmo de Sort por Seleccion que determina si el vector ya está ordenado y  termina
        int largo = v.length;
        boolean ordenado = false;

        for (int i = 0; i<largo && !ordenado;i++){
            int min = v[i];
            int pos_min = i;
            ordenado = true;
            for (int j=i;j<largo;j++){
                if (j+1<largo) {
                    if (v[j]<v[j+1]){
                        ordenado = true && ordenado;
                    }
                    else {
                        ordenado = false && ordenado;
                    }                  
                }
                if (v[j] < min) {
                    min = v[j];
                    pos_min = j;
                }
            }
            if (!ordenado){
                int aux = v[i];
                v[i] = min;
                v[pos_min]=aux;
            } else {
                System.out.println("El vector ya estaba ordenado");
            }        
        }
    }

}
