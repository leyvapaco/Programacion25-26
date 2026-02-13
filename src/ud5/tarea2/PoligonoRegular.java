package ud5.tarea2;

public abstract class PoligonoRegular implements Figura {

	//Observar como podemos indicar, en la propia clase abstracta, que implementamos la 
	//interfaz puesto que todos los hijo lo harán
	
    protected double lado;  // visible para hijas y vecinas
    public String color;   

    protected static int contadorPoligonos = 0; //atributo estático

    public PoligonoRegular() {
        this.lado = 10;
        this.color = "azul";
        contadorPoligonos++;
    }

    public PoligonoRegular(double lado, String color) {
        this.lado = lado;
        this.color = color;
        contadorPoligonos++;
    }

    //Método estático para devolver un atributo estático
    public static int getContadorPoligonos() {
        return contadorPoligonos;
    }

}

