package ud7.tarea5;

// El codigo de las otras clases es de un alumno, no tenía main, cree este principal pero falla al recuperar el id del aspirante para insertarle las notas



public class Principal {

	public static void main (String[] arg) {
		
		IntroducirAspirante entradaDatos = new IntroducirAspirante();
		
		entradaDatos.InsertaAspirantes();
		
		CalificacionPruebas notas = new CalificacionPruebas();
		
		notas.InsertaNotas();
		
	}
	
}
