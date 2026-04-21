package ud7.tarea2;

import java.io.Serializable;

public class Numero implements Serializable {
    private static final long serialVersionUID = 1L;

    private double valor;

    public Numero(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

	@Override
	public String toString() {
		return "Numero [valor=" + valor + "]";
	}

   
}
