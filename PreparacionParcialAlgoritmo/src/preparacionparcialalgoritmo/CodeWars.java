/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package preparacionparcialalgoritmo;

/**
 *
 * @author mauro
 */
public class CodeWars {

    public static String fakeBin(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return (distanceToPump / mpg) <= fuelLeft;
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        // TODO May the force be with you
        int res = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] == true) {
                res++;
            }
        }
        return res;
    }

    public static class Door {

        public static String run(String events) {

            return null;
        }
    }
}
