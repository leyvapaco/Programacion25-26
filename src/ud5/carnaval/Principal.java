package ud5.carnaval;

public class Principal {
	public static void main(String[]args) {
		
		//									nombre, autor, autorMusica, autorLetra, tipo...
		
		Coro coro1 = new Coro("Alegría", "Ernesto Coral", "Manolo", "Daniel","Farola", 1 , 1, 2);
		Comparsa comparsa1 = new Comparsa("Boniatos", "Darío Compar", "Lourdes", "Sergio", "Huevo" , "manolosAtrezo",3);
		Cuarteto cuarteto1 = new Cuarteto("Cuadrilla", "Carlota Cuarta","Alvarez","Tamara","Policia", 4);
		Chirigota chirigota1 = new Chirigota("Demonios", "Bernardo Chiris", "Selu", "Beltran","Marinero",6,4);
		Romancero romancero1 = new Romancero("Estudiantes", "Alberto Román", "Enrique", "Lorenzo", " Caballero","Amor");
	
		Integrante i1 = new Integrante(1, "Alonso",21,"Albacete");
		Integrante i2 = new Integrante(2, "Berta",22,"Bolonia");
		Integrante i3 = new Integrante(3, "Charo",23,"Cádiz");
		Integrante i4 = new Integrante(4, "Darío",24,"Denia");
		Integrante i5 = new Integrante(5, "Eva",25,"Estepona");
		Integrante i6 = new Integrante(6, "Fran",26,"Fuengirola");
		Integrante i7 = new Integrante(7, "Gala",27,"Granada");
		Integrante i8 = new Integrante(8, "Hector",28,"Huelva");
		Integrante i9 = new Integrante(9, "Irene",29,"Iznallloz");
		
		COAC concurso = new COAC();
		
		//Coro con 2 integrantes
		coro1.insertar_integrante(i1);
		coro1.insertar_integrante(i2);
		//Comprobamos que no podemos insertar un tercer integrante
		coro1.insertar_integrante(i3);
		
		//Eliminamos a un integrante
		coro1.eliminar_integrante(i1);
		
		//Insertamos de nuevo un integrante
		coro1.insertar_integrante(i3);
		
		//Observar el código de .toString() en la clase Coro
		System.out.println(coro1.toString());
		
		comparsa1.insertar_integrante(i3);
		comparsa1.insertar_integrante(i4);
		comparsa1.insertar_integrante(i5);
		System.out.println(comparsa1.toString());
		
		chirigota1.insertar_integrante(i6);
		chirigota1.insertar_integrante(i7);
		chirigota1.insertar_integrante(i8);
		chirigota1.insertar_integrante(i9);
		System.out.println(chirigota1.toString());
		
		cuarteto1.insertar_integrante(i6);
		cuarteto1.insertar_integrante(i7);
		cuarteto1.insertar_integrante(i8);
		cuarteto1.insertar_integrante(i9);
		System.out.println(cuarteto1.toString());
		
		concurso.inscribir_agrupacion(coro1);
		concurso.inscribir_agrupacion(comparsa1);
		concurso.inscribir_agrupacion(cuarteto1);
		concurso.inscribir_agrupacion(chirigota1);
				
		System.out.println("\n\nAgrupaciones inscritas:\n");
		System.out.println(concurso.toString());
		
		System.out.println("\n\nCaminito del Falla:");	
		
		coro1.caminito_del_falla();
		comparsa1.caminito_del_falla();
		cuarteto1.caminito_del_falla();
		chirigota1.caminito_del_falla();
				
		//Las agrupaciones oficiales concursan y el jurado emite su veredicto
		coro1.setPuntos(300);
		comparsa1.setPuntos(250);
		cuarteto1.setPuntos(100);
		chirigota1.setPuntos(50);
			
		
		System.out.println("\n\nAgrupaciones ordenadas por nombre (defecto):");		
		concurso.ordenar_por_nombre();		
		
		System.out.println("\n\nAgrupaciones ordenadas por autor:\n");		
		concurso.ordenar_por_autor();		
		
		System.out.println("\n\nAgrupaciones ordenadas por puntos:\n");
		concurso.ordenar_por_puntos();		
		
		
		System.out.println("\n\nEl carnaval sale a la calle:\n");
		romancero1.amo_a_escucha();
		cuarteto1.amo_a_escucha();
		chirigota1.amo_a_escucha();
	}
}
