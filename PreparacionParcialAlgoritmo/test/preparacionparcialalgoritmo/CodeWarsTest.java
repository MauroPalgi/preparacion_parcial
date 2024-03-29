/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package preparacionparcialalgoritmo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import preparacionparcialalgoritmo.CodeWars.Door;

/**
 *
 * @author mauro
 */
public class CodeWarsTest {

    /**
     * Test of fakeBin method, of class CodeWars.
     */
    @Test
    public void testFakeBin() {
        assertEquals("01011110001100111", CodeWars.fakeBin("45385593107843568"));
        assertEquals("101000111101101", CodeWars.fakeBin("509321967506747"));
    }

    /**
     * Test of zeroFuel method, of class CodeWars.
     */
    @Test
    public void testZeroFuel() {
        assertTrue(CodeWars.zeroFuel(50, 25, 2));
        assertFalse(CodeWars.zeroFuel(100, 50, 1));
    }

    @Test
    public void testCountSheeps() {
        Boolean[] array1 = {true, true, true, false,
            true, true, true, true,
            true, false, true, false,
            true, false, false, true,
            true, true, true, true,
            false, false, true, true};

        assertEquals("There are 17 sheeps in total", 17, CodeWars.countSheeps(array1));
    }

    @Test
    public void testDoorRun() {
        testNormalOperation();
        testPause();
        testObstacles();
        testExample();
    }

    @Test
    public void testNormalOperation() {
        test("should stay closed unless button is pressed (no buttonpresses)", "..........", "0000000000");
        test("should start opening on buttonpress", "P..", "123");
        test("should open completely and stay open", "P....", "12345");
    }

    @Test
    public void testPause() {
        test("should start opening and pause on second buttonpress", "P.P..", "12222");
    }

    @Test
    public void testObstacles() {
        test("should reverse while opening", "P.O....", "1210000");
    }

    @Test
    public void testExample() {
        test("should start opening and reverse when obstacle", "..P...O.....", "001234321000");
    }

    private void test(String description, String events, String result) {
        assertEquals(description, result, Door.run(events));
    }

    @Test
    public void PeopleThatPlayBanjo() {
        assertEquals("Nope!", "Martin does not play banjo", CodeWars.areYouPlayingBanjo("Martin"));
        assertEquals("Nope!", "Rikke plays banjo", CodeWars.areYouPlayingBanjo("Rikke"));
        assertEquals("Nope! Remember lower case counts, too!", "rolf plays banjo", CodeWars.areYouPlayingBanjo("rolf"));
        assertEquals("Nope!", "bravo does not play banjo", CodeWars.areYouPlayingBanjo("bravo"));
    }
}
