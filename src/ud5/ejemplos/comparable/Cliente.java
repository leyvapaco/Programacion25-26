package ud5.ejemplos.comparable;

public class Cliente implements Comparable<Cliente> {
	private String dni;
	private String nombre;
	private int edad;
	private double saldo;
	

	public Cliente(String dni, String nombre, int edad, double saldo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Cliente [Dni=" + dni + ", nombre=" + nombre + ", edad=" + edad +"]" ;
	}
	
	
	public boolean equals (Cliente c){
		 
        if(c.getDni().equals(this.dni)){
            return true;
        }else{
            return false;
        }
    }
	 
	  //Comparar enteros:
	 /*
	  @Override
	  public int compareTo(Cliente c) {
		  return this.edad > c.edad ? 1 : this.edad < c.edad ? -1 : 0;
	  }

	  /*
	// Otra forma de comparar enteros
	public int compareTo(Cliente c) {
		return Integer.compare(this.edad, c.edad); 
	}
	
	*/
	
	  // Comparar Strings
	  @Override
	  public int compareTo(Cliente c) {
		  return this.dni.compareTo(c.getDni());
	  }

		
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
