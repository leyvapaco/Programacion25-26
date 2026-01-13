package ud4.animales2;

public abstract class Reptil extends Oviparo {
	private boolean sangreFria=true;

	public boolean isSangreFria() {
		return sangreFria;
	}

	public void setSangreFria(boolean sangreFria) {
		this.sangreFria = sangreFria;
	}

   
}
