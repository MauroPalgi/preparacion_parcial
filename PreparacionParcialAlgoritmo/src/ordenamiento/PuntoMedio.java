/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento;

/**
 *
 * @author mauro
 */
public class PuntoMedio {

    public static int buscarporpuntomedio(int[] v, int elemento) {
        int izquierda = 0, derecha = v.length - 1;

        while (izquierda <= derecha) {
            // Calculamos las mitades...
            int posMedio = (izquierda + derecha) / 2;
            int elementoDelMedio = v[posMedio];

            // Ver si está en la mitad y romper aquí el ciclo
            if (elementoDelMedio == elemento) {
                return posMedio;
            }
            // Si no, entonces vemos si está a la izquierda o derecha

            if (elemento < elementoDelMedio) {
                derecha = posMedio - 1;
            } else {
                izquierda = posMedio + 1;
            }
        }
        // Si no se rompió el ciclo ni se regresó el índice, entonces el elemento no existe
        return -1;
    }
}
