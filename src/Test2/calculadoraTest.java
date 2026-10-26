
package Test2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import SESIONA.calculadora;

class calculadoraTest {

    @Test
    void testSuma() {
        assertEquals(5, calculadora.Suma(3, 2));
    }

    @Test
    void testResta() {
        assertEquals(5, calculadora.Resta(3, 2));
    }

    @Test
    void testMultiplicacion() {
        assertEquals(6, calculadora.Multiplicacion(3, 2));
    }

    @Test
    void testDivision() {
        assertEquals(1, calculadora.Division(3, 2));
    }
}
