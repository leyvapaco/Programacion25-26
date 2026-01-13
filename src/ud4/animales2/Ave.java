package ud4.animales2;

public abstract class Ave extends Oviparo { //Si no hay instancias de Ave, es abstracta
	private int patas;
	private boolean alas;
	
	Ave(){
		super(); //Llama al constructror de la clase padre, Oviparo
	}
	
	@Override
	public void comunicate() {
		System.out.println("Pio pio!");
	}
	   
	 
	public void hacerNido() {
		  System.out.println("Haciendo nido");
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public boolean isAlas() {
		return alas;
	}

	public void setAlas(boolean alas) {
		this.alas = alas;
	}
	   
	   
}
