package ud4.tarea1;

public class Hora {
	private int hora;
	private int minuto;
	private int segundo;
	
	Hora(int hora, int minutos, int segundos){
		this.setHora(hora);
		this.setMinutos(minutos);
		this.setSegundos(segundos);
	}
	
	// Método para sumar segundos 
	public void sumarSegundos(int n) {

	    // 1. Convertir la hora actual a segundos
	    int total = hora * 3600 + minuto * 60 + segundo;

	    // 2. Sumar los segundos que queremos añadir
	    total += n;

	    // 3. Normalizar para que quede dentro de un día (0–86399)
	    total = ((total % 86400) + 86400) % 86400;

	    // 4. Convertir de nuevo a horas, minutos y segundos
	    
	    //Nos quedamos con la parte entera de esta división:
	    hora = total / 3600; 
	    
	    //Segundos sobrantes después de "quitar las horas completas", entre 60 para pasarlo a minutos:
	    minuto = (total % 3600) / 60;
	    
	    //Segundos sobrantes después de "quitar los minutos completos":
	    segundo = total % 60;
	}

	
    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        } else {
            System.out.println("Hora no válida. Debe estar entre 0 y 23.");
        }
    }

    public int getHora() {
        return hora;
    }

    public void setMinutos(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        } else {
            System.out.println("Minuto no válido. Debe estar entre 0 y 59.");
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setSegundos(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        } else {
            System.out.println("Segundo no válido. Debe estar entre 0 y 59.");
        }
    }

    public int getSegundo() {
        return segundo;
    }
    
 // Mostrar la hora en formato HH:MM:SS 
    public String toString() 
    { return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo); }

	
}
