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

}
