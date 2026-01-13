package ud4.animales2;

public class Perro extends Mamifero {
   private int patas; //Al ser private sólo es accesible a través de los métodos setter y getter de la propia clase
   private boolean cola;
   private int numeroChip;
   
   Perro(){
	   super();
	   this.patas=4;
	   this.cola=true;
   }
   
   @Override
   public void comunicate() { //Implementamos el método abstracto comunicate, de la clase Animal
	   System.out.println("Guau, guau!");
   }
   
  
   public void olfatear() {
	   System.out.println("sniff sniff");
   }

   
   public int getPatas() {
	   return patas;
   }


   public void setPatas(int patas) {
	   this.patas = patas;
   }


   public Boolean getCola() {
	   return cola;
   }


   public void setCola(Boolean tieneCola) {
	   this.cola = true;
   }


   public int getNumeroChip() {
	   return numeroChip;
   }


   public void setNumeroChip(int numeroChip) {
	   this.numeroChip = numeroChip;
   }
   
   

}
