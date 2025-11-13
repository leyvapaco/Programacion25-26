package ud3.ejemplos;

public class StringBulderEjemplos {

public static void main(String[] args) {
	// Usando String (menos eficiente)
	String texto = "Hola";
	texto += " mundo"; // Se crea un nuevo objeto cada vez
	
	// Usando StringBuilder (más eficiente)
	StringBuilder sb = new StringBuilder("Hola");
	sb.append(" mundo"); // Se modifica el mismo objeto
	System.out.println("1:"+sb);
		
	//Algunos de los métodos interesantes de StringBuilder
	
	sb.insert(5, "cruel ");
	System.out.println("2:"+sb); // Hola cruel mundo
	
	sb.delete(5, 11);
	System.out.println("3:"+sb); // Hola mundo

	sb.deleteCharAt(4);
	System.out.println("4:"+sb); // Holamundo
	
	sb.replace(4, 11, " Universo");
	System.out.println("5:"+sb); // Hola Universo
	
	sb.reverse();
	System.out.println("6:"+sb); // osrevinU aloH
	
	sb.setLength(0); // Borra el contenido
	sb.append("Hola mundo");
	sb.setCharAt(0, 'M');
	System.out.println("7:"+sb); // Mola mundo
	
	sb.setLength(4);
	System.out.println("8:"+sb); // Mola
	
	System.out.println("8:"+sb.capacity()); // Indica cuántos caracteres puede almacenar sin necesidad de redimensionarse.
	
}
}

