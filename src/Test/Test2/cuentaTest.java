package Test2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.function.BooleanSupplier;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import SESIONA.Cuenta;

	class CuentaTest {
	    @Test
	    void IngresarRetirar() {
	        Cuenta cuenta = new Cuenta("12345", 50);

	        assertTrue(cuenta.retirar(200));
	        assertEquals(-150, ((SESIONA.Cuenta) cuenta).getSaldo());

	        cuenta.Ingresar(100);
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
	        cuenta.Ingresar(50);
	        assertEquals(-450, cuenta.getSaldo());

	        assertFalse(cuenta.retirar(100));
	        assertEquals(-450, cuenta.getSaldo());
	    }

	    @Test
	    void Positivas() {
	        Cuenta cuenta = new Cuenta("12345", 50);
	        assertThrows(IllegalArgumentException.class, () -> cuenta.Ingresar(0));
	        assertThrows(IllegalArgumentException.class, () -> cuenta.retirar(-10));
	    }
	

		
		
	}
	
	
	
	