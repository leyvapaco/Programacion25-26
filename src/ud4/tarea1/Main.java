package ud4.tarea1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Que actividad desea comprobar? (1-10)");
		int opciones = sc.nextInt();
		
		switch (opciones) {
		case 1, 2:
			
			//ACTIVIDAD 1 Y 2
			CuentaCorriente Cuenta1 = new CuentaCorriente("Manolo Lama", "43215933J");
			CuentaCorriente Cuenta2 = new CuentaCorriente(45);
			CuentaCorriente Cuenta3 = new CuentaCorriente(25, -150, "13834353X");
			
			//INGRESO DE DINERO
			Cuenta1.IngresarDinero(230);
			
			//RETIRO DE DINERO
			System.out.println("Estado de la transacción: "+Cuenta1.SacarDinero(222));
			
			//INFORMACIÓN DE LA CUENTA
			System.out.println("----Cuenta 1----");
			Cuenta1.MostrarInfo();
			System.out.println("----Cuenta 2----");
			Cuenta2.MostrarInfo();
			System.out.println("----Cuenta 3----");
			Cuenta3.MostrarInfo();
			
			break;
			
		case 4:
			
			//ACTIVIDAD 4
			CuentaCorriente Cuenta4 = new CuentaCorriente("Manolo Lama", "43215933J");
			CuentaCorriente Cuenta5 = new CuentaCorriente("Juan Alberto", "93254233J");
			CuentaCorriente Cuenta6 = new CuentaCorriente("Ronaldinho", "73245233W");
			System.out.println("Nombre del Banco: "+Cuenta4.GetBanco());
			
			Cuenta4.SetBanco("Aerwrer");
			System.out.println(Cuenta4.GetBanco());
			System.out.println(Cuenta5.GetBanco());
			System.out.println(Cuenta6.GetBanco());
			break;
		
		case 5:
			
			//ACTIVIDAD 5
			String CadenaEjemplo = "Esto es un ejemplo";
			Texto Texto1 = new Texto(CadenaEjemplo, 30);
			
			Texto1.addCadenaCaracteres('c');
			Texto1.addCadenaCadena(" AYUDA ");
			System.out.println(Texto1.contarVocales(CadenaEjemplo));
			
			break;
			
		
		case 6:
			
			//ACTIVIDAD 6
			String NombreBanco = "BancoNum1";
			String Dirección = "Sevilla";
			
			Banco Banco1 = new Banco(NombreBanco, Dirección);
			Banco Banco2 = new Banco("BancoNum2", "Malaga");
			
			//INFO DE LOS BANCOS
			System.out.println("Nombre del banco: "+Banco1.getNombre());
			System.out.println("Capital: "+Banco1.getCapital());
			System.out.println("Dirección: "+Banco1.getDireccionCentral());
			
			System.out.println("Nombre del banco: "+Banco2.getNombre());
			System.out.println("Capital: "+Banco2.getCapital());
			System.out.println("Dirección: "+Banco2.getDireccionCentral());
			
			//CAMBIO DE ATRIBUTOS
			Banco1.setCapital(6000000);
			Banco1.setDireccionCentral("Madrid");
			
			//COMPROBACIÓN DEL CAMBIO DE ATRIBUTOS
			System.out.println("\n");
			System.out.println("---ATRIBUTOS CAMBIADOS---");
			System.out.println("Capital: "+Banco1.getCapital());
			System.out.println("Dirección: "+Banco1.getDireccionCentral());
			
			break;
			
			
		case 7: 
			
			//ACTIVIDAD 7
			Sintonizador Sinte1 = new Sintonizador();
			
			System.out.println(Sinte1.display());
			Sinte1.down(); //LA FRECUENCIA DEBE CAMBIAR A 180
			System.out.println(Sinte1.display());
			Sinte1.up(); //LA FRECUENCIA DEBE VOLVER A 80
			System.out.println(Sinte1.display());
			Sinte1.up();
			Sinte1.up();
			Sinte1.up(); //DESPUES DE 3 SUBIDAS, LA FRECUENCIA DEBE SER DE 81.5
			System.out.println(Sinte1.display());
			
			break;
			
		case 8:
			
			//ACTIVIDAD 8
			Bombilla bombilla1 = new Bombilla(true);
			Bombilla bombilla2 = new Bombilla(false);
			Bombilla bombilla3 = new Bombilla(true);
			Bombilla bombilla4 = new Bombilla(false);
			
			System.out.println("--PRUEBA GENERAL--");
			bombilla1.getEstado();
			bombilla4.getEstado();
			bombilla3.getEstado();
			bombilla2.getEstado();
			//APAGADO DE LOS PLOMOS
			Bombilla.apagaPlomos();
			
			System.out.println("--PRUEBA CON LOS PLOMOS APAGADOS--");
			bombilla1.getEstado();
			bombilla4.getEstado();
			bombilla3.getEstado();
			bombilla2.getEstado();
			//REPARACIÓN DE LOS PLOMOS
			Bombilla.reparaPlomos();
			
			System.out.println("--PRUEBA CON LOS PLOMOS REPARADOS--");
			bombilla1.getEstado();
			bombilla4.getEstado();
			bombilla3.getEstado();
			bombilla2.getEstado();
			break;
			
			
		case 9:
			
			//ACTIVIDAD 9
			Maquinista maquinista1 = new Maquinista("AA", "12568932U", 15478, "Rango 3");
			Mecanico mecanico1 = new Mecanico("ABC", "45576832G", "Frenos");
			JefeEstacion jefe1 = new JefeEstacion("CDF", "35678921X");
			
			Vagon vagon1 = new Vagon(4321, 288, "Carbón");
			Locomotora locomotora1 = new Locomotora("2467 JBG", 7600,"2010", mecanico1);
			Tren tren1 = new Tren(locomotora1, maquinista1);
			
			//INFO DEL PERSONAL
			System.out.println();
			System.out.println("--INFO MAQUINISTA--");
			maquinista1.getInfoPersonal();
			System.out.println("---INFO MECANICO---");
			mecanico1.getInfoPersonal();
			System.out.println("-----INFO JEFE-----");
			jefe1.getInfoPersonal();
			
			
			//INFO DE LAS MAQUINAS
			System.out.println();
			System.out.println("----INFO VAGÓN-----");
			vagon1.getInfoMaquinaria();
			System.out.println("--INFO LOCOMOTORA--");
			locomotora1.getInfoMaquinaria();
			
			break;
			
		case 10:
			
			//ACTIVIDAD 10
			System.out.println("Escriba la hora que desea utilizar (Formato 1 - 12): ");
			int hora = sc.nextInt();
			System.out.println("\n"+"Escriba la cantidad de minutos que tiene su hora deseada (Formato 00 - 60): ");
			int minutos = sc.nextInt();
			System.out.println("\n"+"Escriba la cantidad de segundos que desea añadir: ");
			int segundos = sc.nextInt();
			
			Hora hora1 = new Hora(hora, minutos, segundos);
			hora1.sumaHora(hora, minutos, segundos);
			
			break;
		default:
			break;
		}
		
		
		
	sc.close();	
	}
}
