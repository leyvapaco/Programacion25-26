package ud4.visibilidad;

import ud4.animales2.Mamifero;

public class Gato extends Mamifero {
   private int patas; 
   private boolean cola;
   
   public Gato(){
	   super();
	   this.patas=4;
	   this.cola=true;
   }
   
   @Override
   public void comunicate() { //Implementamos el método abstracto comunicate, de la clase Animal
	   System.out.println("Miau, miau!");
   }
   
  
   public void arañar() {
	   System.out.println("xiiiiiii");
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
   

}
