package ud4.tarea1.ferroviaria;

import java.util.Arrays;

public class Tren extends Maquinaria{
	private Locomotora locomotora;
	private Maquinista maquinista;
	public static final int MAX_VAGONES = 5;
	private Vagon[] vagones;
	

	public Tren(Locomotora locomotora, Maquinista maquinista) {
		this.locomotora=locomotora;
	    this.maquinista=maquinista;
	    this.vagones = new Vagon[MAX_VAGONES];
	}
	
		
	public void setMaquinista(Maquinista maquinista) {
		this.maquinista = maquinista;
	}

	public void addVagon(Vagon vagon) {
		int i=0;
			
		while ((i<MAX_VAGONES)&&(this.vagones[i]!=null)) {
			i++;
		}//Busco la posición del array en la que añadir el vagón
		
		if (i>=MAX_VAGONES)
			System.out.println("No se puede");
		else 
			this.vagones[i]=vagon;
	}
	
	public void quitaVagon(Vagon vagon) {
		int i=0;
		int j=0;
		
		Vagon[] vagonesAux = new Vagon[MAX_VAGONES];
		
		while ((i<MAX_VAGONES)&&(this.vagones[i]!=vagon)) {
			vagonesAux[j]=this.vagones[i];
			i++;
			j++;
		}//Vuelco en un nuevo array los vagones que hay delante del que quiero quitar

		
		i++; //Paso al siguiente vagón después del que quiero quitar
		while (i<MAX_VAGONES) {
			vagonesAux[j]=this.vagones[i];
			i++;
			j++;
		}//Vuelco en un nuevo array los vagones que hay detrás del que quiero quitar	

		
		this.vagones=Arrays.copyOf(vagonesAux, MAX_VAGONES);
		
	}
	
	public Vagon[] getVagones() {
		return vagones;
	}

	public Locomotora getLocomotora() {
		return locomotora;
	}

	public void setLocomotora(Locomotora locomotora) {
		this.locomotora = locomotora;
	}

	@Override
	public void getInfoMaquinaria() {
		System.out.println("\nLocomotora: "+getLocomotora().toString());
		
		System.out.println("Vagones: ");
		
		int i=0;
		while ((i<MAX_VAGONES)&&(this.vagones[i]!=null))
		{
			System.out.println(vagones[i].toString());
			i++;
		}
		
	}
		
}