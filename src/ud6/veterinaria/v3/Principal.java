package ud6.veterinaria.v3;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Principal {
    public static void main(String[] args) {
        try {
            Clinica clinica = new Clinica();

            Propietario p1 = new Propietario("Paco", "600123123");
            Propietario p2 = new Propietario("Ana", "611222333");

            Perro perro1 = new Perro("Coke", 5, "Schnauzer mini", "CH123",
                    Sexo.MACHO, 20000, p1);
            Perro perro2 = new Perro("Luna", 3, "Beagle", "CH999",
                    Sexo.HEMBRA, 15000, p2);
            Gato gato1 = new Gato("Misu", 2, "Persa", "CH555",
                    Sexo.HEMBRA, 5000, p1);
            Serpiente s1 = new Serpiente(EspecieSerpiente.COBRA, true,
                    Sexo.MACHO, 3000, null);

            clinica.addAnimal(perro1);
            clinica.addAnimal(perro2);
            clinica.addAnimal(gato1);
            clinica.addAnimal(s1);

            Consulta con1 = new Consulta(LocalDate.of(2024, 1, 10),
                    perro1.getId(), "Otitis");
            con1.addMedicamento(new Medicamento("Amoxicilina", 500, 12.5));
            con1.addMedicamento(new Medicamento("Ibuprofeno", 200, 5.0));

            clinica.addConsulta(perro1.getId(), con1);

            System.out.println("Total animales: " + clinica.cuantosAnimales());

            List<Perro> perrosAsc = clinica.perrosByRaza(true);
            System.out.println("Perros por raza ascendente: " + perrosAsc);

            Set<Consulta> consultasPerro1 = clinica.getConsultas(perro1.getId());
            System.out.println("Consultas perro1: " + consultasPerro1);

            System.out.println("Medicamentos consulta1 por peso desc: "
                    + clinica.getMedicamentosByPeso(con1));

            Set<Animal> sinConsultas = clinica.getAnimalesSinConsultas();
            System.out.println("Animales sin consultas: " + sinConsultas);

            Set<Medicamento> medsPerro1 = clinica.getMedicamentosByAnimal(
                    perro1.getId(),
                    LocalDate.of(2024, 1, 1),
                    LocalDate.of(2024, 12, 31));
            System.out.println("Medicamentos únicos perro1 en 2024: " + medsPerro1);

            Map<Propietario, List<Animal>> mapa = clinica.mapAnimalesByPropietario();
            System.out.println("Mapa animales por propietario: " + mapa);

        } catch (AnimalNoEncontradoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
