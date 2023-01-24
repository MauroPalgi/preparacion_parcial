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
        var vector = new int[]{12, 8, 9, 4, 36, 100};
        Burbuja burbuja = new Burbuja();
        burbuja.Ordenamiento(vector);
    }

}
