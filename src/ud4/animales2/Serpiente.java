package ud4.animales2;


public class Serpiente extends Reptil {
	
	public enum Especies{COBRA,PITON,VIBORA;}
	
	Serpiente(){
		   super(); //Usamos constructor del padre
	   }
	
    @Override
	public void comunicate() {
	   System.out.println("sss sss!");
	}
	   
	public void morder(Especies especieSerpiente, Animal animalMordido) {
		   System.out.println("me ha mordido una "+especieSerpiente);
		   if (especieSerpiente==Especies.COBRA){
			   animalMordido.muere(); //Si muriese la propia serpiente sería this.muere()
		   }
		}   
	   	   
   public static void muestraEspecies() {
	   for(Especies esp: Especies.values()){
			System.out.print(esp.name()+" - ");
		}
	   System.out.println();
   }
}
