package SESIONA;


public class Cuenta{
	private static final int limite = 500;
	   String numero;
	   String nombre;
	  Double saldo ;
	  public String getNumero() {
		return numero;
	  }
	  public void setNumero(String numero) {
		this.numero = numero;
	  }
	  public String getNombre() {
		return nombre;
	  }
	  public void setNombre(String nombre) {
		this.nombre = nombre;
	  }
	  public Double getSaldo() {
		return saldo;
	  }
	  public void setSaldo(Double saldo) {
		this.saldo = saldo;
	  }

	  public void Ingresar(double d) {
	  this.saldo+=d;
		  
		
	}
	 
	public void retirar(double d ) {
		this.saldo =-d;
		
	}

    public void Cuenta(String numero, String nombre, int saldo) {
        if (numero == null || numero.isBlank()) {
            throw new IllegalArgumentException("El número de cuenta es obligatorio");
        }
        if (saldo < -limite) {
            throw new IllegalArgumentException("El saldo inicial supera el descubierto permitido");
        }
        this.numero = numero;
        this.saldo = (double) saldo;
}
	}


