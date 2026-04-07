package ud6.veterinaria.v3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Consulta {
    private LocalDate fecha;
    private int idAnimal;
    private String diagnostico;
    private List<Medicamento> medicamentosRecetados; 
    //Consideraremos una lista, pero también valdría plantear un Set (en tal caso habría
    // que asegurarse en el enunciado de que los medicamentos no se pueden repetir)
    
     public Consulta(LocalDate fecha, int idAnimal, String diagnostico) {
        this.fecha = fecha;
        this.idAnimal = idAnimal;
        this.diagnostico = diagnostico;
        this.medicamentosRecetados = new ArrayList<>();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getIdAnimal() {
        return idAnimal;
    }
     
    public List<Medicamento> getMedicamentos() {
        return medicamentosRecetados;
    }

    public void addMedicamento(Medicamento m) {
        medicamentosRecetados.add(m);
    }
    
    
    public boolean removeMedicamento(String nombreMedicamento) {
        boolean eliminado = false;
        Iterator<Medicamento> it = medicamentosRecetados.iterator();

        while (it.hasNext() && !eliminado) {
            Medicamento actual = it.next();
            if (actual.getNombre().equalsIgnoreCase(nombreMedicamento)) {
                it.remove();
                eliminado = true;
            }
        }

        return eliminado;
    }

    /* ALTERNATIVA, iterando por las posiciones de los elementos (al ser una lista)
    
    public boolean removeMedicamento(String nombreMedicamento) {
        boolean eliminado = false;
        for (int i = 0; i < medicamentos.size() && !eliminado; i++) {
            Medicamento actual = medicamentos.get(i);
            if (actual.getNombre().equalsIgnoreCase(nombreMedicamento)) {
                medicamentos.remove(i);
                eliminado = true;
            }
        }
        return eliminado;
    } */

    @Override
    public String toString() {
        return "Consulta{" +
                "fecha=" + fecha +
                ", idAnimal=" + idAnimal +
                ", diagnostico='" + diagnostico + '\'' +
                ", medicamentos=" + medicamentosRecetados +
                '}';
    }
}
