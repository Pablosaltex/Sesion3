package SESIONA;

public class calculadora {
	   String numero;
	   String nombre;
	  Double saldo ;
	  private String nombre2;

	  
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









	}