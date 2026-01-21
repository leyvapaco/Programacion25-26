package ud4.tarea1;
public class CuentaCorrienteEj6 {
	private int saldo;
	private int limite;
	public String nombre;
	String DNI;
	private Banco banco;
	
	CuentaCorrienteEj6(String nombre, String DNI){
		this.nombre = nombre;
		this.DNI = DNI;
		this.saldo = 0;
		this.limite = -50;
		
	}

	CuentaCorrienteEj6(int saldo){
		this.saldo = saldo;
		this.limite = 0;
	}
	
	CuentaCorrienteEj6(int saldo, int descubierto, String DNI){
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

	
	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	
	public int getSaldo() {
		return saldo;
	}

	
	@Override
	public String toString() {
		return "CuentaCorrienteEj6 [saldo=" + saldo + ", limite=" + limite + ", nombre=" + nombre + ", DNI=" + DNI
				+ ", banco=" + banco + "]";
	}

	public void mostrarInfo() {
		System.out.println(this.toString());
	}
	
	
}
