package ud6.fiesta;


//Clase Cliente
public class Invitado implements Comparable<Invitado> {
 private String nombre;
 private int edad;

 public Invitado(String nombre, int edad)  {
    this.nombre = nombre;
     this.edad = edad;
 }

 public String getNombre() {
     return nombre;
 }

 public int getEdad() {
     return edad;
 }

@Override
public String toString() {
	return nombre;
}
 
@Override
public int compareTo(Invitado inv) {
	return Integer.compare(this.edad, inv.edad); 
}
 
}

