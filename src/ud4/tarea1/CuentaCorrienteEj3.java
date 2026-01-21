package ud4.tarea1;
public class CuentaCorrienteEj3 {
	private int saldo;
	private int limite;
	public String nombre;
	String DNI;
	static String banco; //El mismo nombre de banco para todas las cuentas
	
	CuentaCorrienteEj3(String nombre, String DNI){
		this.nombre = nombre;
		this.DNI = DNI;
		this.saldo = 0;
		this.limite = -50;
		
	}

	CuentaCorrienteEj3(int saldo){
		this.saldo = saldo;
		this.limite = 0;
	}
	
	CuentaCorrienteEj3(int saldo, int descubierto, String DNI){
		this.saldo = saldo;
		this.limite = descubierto;
		this.DNI = DNI;
	}
	
	public boolean retirar(int importe) {
		boolean aceptada = true;
		
		if(((this.saldo - this.limite) - importe)< 0) { //Superamos el límite de descubierto. Denegada
			aceptada = false;
		} else { //Aceptada
			this.saldo-=importe;
		}
		return aceptada;
	}

	public int ingresar(int importe) {
		int saldoTotal = this.saldo + importe;
		this.saldo = saldoTotal;
		
		return this.saldo;
	}

	
	public String getBanco() {
		return banco;
	}
	
	//Los atributos estáticos se modifican con métodos estáticos
	//Los métodos estáticos son de la clase, no requieren que haya objetos
	public static void setBanco(String idBanco) {
		banco = idBanco;
	}

	
	public int getSaldo() {
		return saldo;
	}

	

	@Override
	public String toString() {
		return "CuentaCorriente [saldo=" + saldo + ", limite=" + limite + ", nombre=" + nombre + ", DNI=" + DNI + "]";
	}

	public void mostrarInfo() {
		System.out.println(this.toString());
	}
	
	
}
