/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento;

/**
 *
 * @author mauro
 */
public class Quick {
      public static void quickSort(int lista[], int inicio, int fin) {
        if (inicio < fin) {
            int pos = particion(lista, inicio, fin);
            quickSort(lista, inicio, pos - 1);
            quickSort(lista, pos + 1, fin);
        }
    }

    public static int particion(int lista[], int inicio, int fin) {
        int pivot = lista[fin];
        int i = inicio;
        for (int j = inicio; j < fin; j++) {
            if (lista[j] <= pivot) {
                int aux = lista[i];
                lista[i] = lista[j];
                lista[j] = aux;
                i++;
            }
        }
        int aux=lista[i];
        lista[i]=lista[fin];
        lista[fin]=aux;
        return i;
    }
}
