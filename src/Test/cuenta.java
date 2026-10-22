package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class cuenta {

	cuenta cuenta;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		cuenta = new cuenta(0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngreso() {
		cuenta.ingresar(500);
		assert.equals(500, cuenta.getSaldo());
	}

	@Test
	void testRetirar() {
		cuenta.retirar(500);
		
		assert.equals(-500, cuenta.getsaldo());
		
		
		
	}
	@Test
	void test0014() {
		
		
	}
	
	
	}
	
}