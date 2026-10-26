package Test2;

import static org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import SESIONA.Cuenta;


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

	import org.junit.jupiter.api.Test;
	import static org.junit.jupiter.api.Assertions.*;

	class CuentaTest {
	    @Test
	    void IngresarRetirar() {
	        Cuenta cuenta = new Cuenta("12345", 50);

	        assertTrue(cuenta.retirar(200));
	        assertEquals(-150, cuenta.getSaldo());

	        cuenta.ingresar(100);
	        assertEquals(-50, cuenta.getSaldo());

	        assertTrue(cuenta.retirar(200));
	        assertEquals(-250, cuenta.getSaldo());
	    }

	    @Test
	    void ExactamenteAlLimite() {
	        Cuenta cuenta = new Cuenta("67890", 0);

	        assertTrue(cuenta.retirar(350));
	        assertTrue(cuenta.retirar(150));
	        assertEquals(-500, cuenta.getSaldo());
	    }

	    @Test
	    void rechazaRetirada() {
	        Cuenta cuenta = new Cuenta("67890", 0);

	        assertTrue(cuenta.retirar(350));
	        assertFalse(cuenta.retirar(200));
	        assertEquals(-350, cuenta.getSaldo());

	        assertTrue(cuenta.retirar(150));
	        cuenta.ingresar(50);
	        assertEquals(-450, cuenta.getSaldo());

	        assertFalse(cuenta.retirar(100));
	        assertEquals(-450, cuenta.getSaldo());
	    }

	    @Test
	    void Positivas() {
	        Cuenta cuenta = new Cuenta("12345", 50);
	        assertThrows(IllegalArgumentException.class, () -> cuenta.ingresar(0));
	        assertThrows(IllegalArgumentException.class, () -> cuenta.retirar(-10));
	    }
	

		
		
	}
	
	
	
	