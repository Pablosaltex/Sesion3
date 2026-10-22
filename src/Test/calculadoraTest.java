package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import SESION3.Calculadora;

class calculadoraTest {

	@Test
	void testSuma() {
		assertEquals(5, Calculadora.suma(3,2));
	}

	void testResta() {
		assertEquals(5, Calculadora.Resta(3,2));
	}

	void testMultiplicacion() {
		assert.Equals(5, Calculadora.Multiplicacion(3,2));	
		
	}
	void testDivision() {
		assertEquals(5, Calculadora.Division(3,2));	
		
	}
	
	
	
	
	
}
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
