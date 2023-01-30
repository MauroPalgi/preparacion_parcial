/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package preparacionparcialalgoritmo;

//import estructuras.*;
//import pruebas.Test;
//import ordenamiento.*;
// import org.junit.runner.*;
import ordenamiento.*;

/**
 *
 * @author mauro
 */
public class PreparacionParcialAlgoritmo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var vector = new int[]{5, 6, 3, 1, 8, 7, 2, 4};
//        Burbuja burbuja = new Burbuja();
//        burbuja.Ordenamiento(vector);
//        Insercion insercion = new Insercion();
//        insercion.Ordenamiento(vector);
        Seleccion selecion = new Seleccion();
        selecion.Ordenamiento(vector);
    }

}
