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
            int doorState = 0;
            char state = '0';
            char[] eventsArr = events.toCharArray();
            char[] response = new char[events.length()];
            for (int i = 0; i < eventsArr.length; i++) {
                char event = eventsArr[i];
                if (event == '.') {
                    if (state == '+') {
                        doorState++;
                    }
                    if (state == '-' && doorState >= 0) {
                        doorState--;
                    }
                    if (state == '-' && doorState == 0) {
                        state = '.';
                    }
                    response[i] = Character.forDigit(doorState, 10);
                }

                if (event == 'P') {
                    switch (state) {
                        case '.':
                        case '0':
                            state = '+';
                            doorState++;
                            response[i] = Character.forDigit(doorState, 10);
                            break;
                        case '+':
                        case '-':
                            state = '.';
                            response[i] = Character.forDigit(doorState, 10);
                            break;
                        default:
                            break;
                    }
                }
                if (event == 'O') {
                    switch (state) {
                        case '.':
                        case '0':
                            state = '+';
                            response[i] = Character.forDigit(doorState, 10);
                            break;
                        case '+':
                            state = '-';
                            doorState--;

                            break;
                        case '-':
                            state = '+';
                            if (doorState < 5) {
                                doorState++;
                            }
                            break;
                        default:
                            break;
                    }
                    response[i] = Character.forDigit(doorState, 10);
                }

            }
            return new String(response);
        }
    }
}
/*
    if (event == 'O' || lastEvent == 'O') {
                    lastEvent = 'O';
                    if (doorState > 0) {
                        doorState--;
                    } else {
                        if (doorState == 0) {
                            lastEvent = 'S';
                        }
                    }
                }

                if (event == 'P') {
                    if (lastEvent == 'P') {
                        lastEvent = 'S';
                        response[i] = Character.forDigit(doorState, 10);
                    } else {
                        doorState++;
                        if (doorState < 5) {
                            response[i] = Character.forDigit(doorState, 10);

                        } else {
                            if (doorState == 5) {
                                response[i] = Character.forDigit(doorState, 10);
                                doorState = 0;
                            }

                        }
                    }
                }
                if (event == '.' || lastEvent == 'S') {
              
                    response[i] = Character.forDigit(doorState, 10);
                    lastEvent = 'S';
                }
 */
