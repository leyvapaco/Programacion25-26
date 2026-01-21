package ud4.tarea1;
public class CuentaCorrienteEj1 {
	private int saldo;
	private int limite;
	private String nombre;
	private String DNI;
	static String banco;
	
	CuentaCorrienteEj1(String nombre, String DNI){
		this.nombre = nombre;
		this.DNI = DNI;
		this.saldo = 0;
		this.limite = -50;
		
	}
	
	public int getSaldo() {
		return saldo;
	}

	CuentaCorrienteEj1(int saldo){
		this.saldo = saldo;
		this.limite = 0;
	}
	
	CuentaCorrienteEj1(int saldo, int descubierto, String DNI){
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
	
	public static void setBanco(String idBanco) {
		banco = idBanco;
	}


	
	@Override
	public String toString() {
		return "CuentaCorriente [saldo=" + saldo + ", limite=" + limite + ", nombre=" + nombre + ", DNI=" + DNI + "]";
	}

	public void mostrarInfo() {
		System.out.println(this.toString());
	}
	
	
}
