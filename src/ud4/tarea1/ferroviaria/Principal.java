package ud4.tarea1.ferroviaria;

public class Principal {
public static void main(String[] args) {
	
	//ACTIVIDAD 9
	Maquinista maquinista1 = new Maquinista("Yazmine Lamal", "12568932U", 15478, "Rango 3");
	Mecanico mecanico1 = new Mecanico("Flicky Hans", "45576832G", "Frenos");
	Mecanico mecanico2 = new Mecanico("Manolo Tuercas", "15576832H", "Tracción");
	JefeEstacion jefe1 = new JefeEstacion("Adrian Newey", "35678921X");

	Locomotora locomotora1 = new Locomotora("2467 AVE", 7600,"2010", mecanico1);
	locomotora1.setMecanico(mecanico2);
	
	Vagon vagonC = new Vagon(4321, 288, "Carbón");
	Vagon vagonH = new Vagon(5000, 300, "Hierro");
	Vagon vagonM = new Vagon(4321, 288, "Madera");
	
	Tren tren1 = new Tren(locomotora1, maquinista1);
	
	tren1.setLocomotora(locomotora1);
	tren1.addVagon(vagonC);
	tren1.addVagon(vagonH);
	
	//INFO DEL PERSONAL
	System.out.println("\n--INFO MAQUINISTA--");
	maquinista1.getInfoPersonal();
	System.out.println("---INFO MECANICO---");
	mecanico1.getInfoPersonal();
	System.out.println("-----INFO JEFE-----");
	jefe1.getInfoPersonal();
	
	//INFO DE LAS MAQUINAS
	System.out.println("\n----INFO VAGÓN-----");
	vagonC.getInfoMaquinaria();
	System.out.println("--INFO LOCOMOTORA--");
	locomotora1.getInfoMaquinaria();
	
	//INFO DEL TREN
	System.out.println("\n--INFO TREN--");
	tren1.getInfoMaquinaria();
	
	System.out.println("--AÑADO VAGON 3 MADERA-");
	tren1.addVagon(vagonM);
	tren1.getInfoMaquinaria();
	
	System.out.println("--QUITO VAGON 2 HIERRO-");
	tren1.quitaVagon(vagonH);
	tren1.getInfoMaquinaria();
	
	System.out.println("--QUITO ULTIMO VAGON 3 MADERA-");
	tren1.quitaVagon(vagonM);
	tren1.getInfoMaquinaria();
	
	System.out.println("--INTENTO QUITAR UNICO VAGON 1 CARBON-");
	tren1.quitaVagon(vagonC);
	tren1.getInfoMaquinaria();
	
	//A partir de aquí peta. Revisar
	System.out.println("--QUITO UN VAGON QUE NO EXISTE");
	tren1.quitaVagon(vagonC);
	tren1.getInfoMaquinaria();
	
	
	System.out.println("--INTENTO AÑADIR 6 VAGONES---");
	tren1.addVagon(vagonM);
	tren1.addVagon(vagonM);
	tren1.addVagon(vagonM);
	tren1.addVagon(vagonM);
	tren1.addVagon(vagonM);
	tren1.addVagon(vagonM);
	tren1.getInfoMaquinaria();
	
}
}
