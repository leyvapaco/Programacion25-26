package ud6.veterinaria.v3;

import java.time.LocalDate;
import java.util.*;

public class Clinica {
    private Map<Integer, List<Consulta>> consultas = new HashMap<>();
    //Como ejemplo del mapa, tendríamos como clave el ID de tu perro, y como valor, todas sus consultas al veterinario

    private List<Animal> animales = new ArrayList<>();
    //Además del mapa que solicita el enunciado, puedo crearme las estructuras de datos que considere oportuno,
    //si ello me falicita resolver algún método. En este caso, una lista de animales atendidos.

    public void addAnimal(Animal a) {
        animales.add(a);
        consultas.put(a.getId(), new ArrayList<Consulta>());
    }

    public void addConsulta(int idAnimal, Consulta c) throws AnimalNoEncontradoException {
        if (!consultas.containsKey(idAnimal)) {
            throw new AnimalNoEncontradoException("Animal no encontrado");
        }
        consultas.get(idAnimal).add(c);
    }

    //Usaremos en la implementación el método estático definido en la clase Animal
    public int cuantosAnimales() {
        return Animal.getTotalAnimales();
    }

    // perros creados ordenados por raza (ascendente o descendente según el parámetro).
    public List<Perro> perrosByRaza(boolean ascendente) {
        List<Perro> listaResultado = new ArrayList<>(); //lista en la que volcar los animales que sean perro
        Iterator<Animal> it = animales.iterator(); //Itero sobre la lista completa de animales que han ido a la clínica

        while (it.hasNext()) {
            Animal a = it.next();
            if (a instanceof Perro) {   //Comprobamos que el Animal sea un Perro con instanceof
                listaResultado.add((Perro) a);
            }
        }

        if (ascendente) {
        	//Los Strings ya implementan el compareTo(), por esta razón en este ejemplo podemos comparar la raza sin necesidad
        	//de implementar el interfaz Comparable -método compareTo()- en la clase Perro. Pero también valdría implementar Comparable en Perro, y de esta forma
        	//Ahora bien, si usasemos un TreeSet en lugar de una lista, entonces sí necesitaríamos que Perro implementase el interfaz Comparable
        	// (o bien proporcionar un Comparator al crear el TreeSet).
        	
            Collections.sort(listaResultado, (p1, p2) -> p1.getRaza().compareTo(p2.getRaza()));
        } else {
            Collections.sort(listaResultado, (p1, p2) -> p2.getRaza().compareTo(p1.getRaza()));
        }

        return listaResultado;
    }
    
    /* Alternativa a perrosByRaza usando un TreeSet en lugar de un ArrayList, y suponiendo que Perro implementa Comparable
    public Set<Perro> perrosByRaza(boolean ascendente) {

        Set<Perro> resultado;

        if (ascendente) {
            // Usa el compareTo() de Perro
            resultado = new TreeSet<>();
        } else {
            // Orden inverso del compareTo()
            resultado = new TreeSet<>(Comparator.reverseOrder());
        }

        for (Animal a : animales) {
            if (a instanceof Perro) {
                resultado.add((Perro) a);
            }
        }

        return resultado;
    }*/

    
    /* Alternativa a perrosByRaza usando un TreeSet que define un comparador sobre la marcha
     
    public Set<Perro> perrosByRaza(boolean ascendente) {

        Comparator<Perro> comp = ascendente
                ? (p1, p2) -> p1.getRaza().compareTo(p2.getRaza())
                : (p1, p2) -> p2.getRaza().compareTo(p1.getRaza());

        Set<Perro> resultado = new TreeSet<>(comp);

        for (Animal a : animales) {
            if (a instanceof Perro) {
                resultado.add((Perro) a);
            }
        }

        return resultado;
    }*/
       

    //Consultas realizadas a un determinado Animal, por orden de inserción. 
    public Set<Consulta> getConsultas(int idAnimal) throws AnimalNoEncontradoException {
        if (!consultas.containsKey(idAnimal)) {
            throw new AnimalNoEncontradoException("Animal no encontrado");
        }
        Set<Consulta> setResultado = new LinkedHashSet<>(consultas.get(idAnimal)); //Recupera todas las consultas de un animal y las ordena por inserción al ser Linked
        return setResultado;
    }

    
    //medicamentos recetados en una determinada consulta (pueden repetirse), ordenados por gramos 
   
    public List<Medicamento> getMedicamentosByPeso(Consulta c) {
        List<Medicamento> listaResultado = new ArrayList<>();
        Iterator<Medicamento> it = c.getMedicamentos().iterator();

        while (it.hasNext()) {
            listaResultado.add(it.next());
        }

        // Orden descendente por gramos. Colletions.sort requiere que se le indique un objeto comparador.
        Collections.sort(listaResultado, new Comparator<Medicamento>() {       
            //Podríamos crear una clase aparte que implemente la interfaz Comparator o bien hacerlo así directamente, implementando el método compare()
        	@Override
        	public int compare(Medicamento m1, Medicamento m2) {
                return Integer.compare(m2.getGramos(), m1.getGramos());
            }
        });

        return listaResultado;
    } 
    
    /* Alternativa al método anterior, recorriendo elementos por posición, al ser una lista
    
    public List<Medicamento> getMedicamentosByPeso(Consulta c) {
        List<Medicamento> lista = new ArrayList<>(c.getMedicamentos());

        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(i).getGramos() < lista.get(j).getGramos()) {
                    Medicamento tmp = lista.get(i);
                    lista.set(i, lista.get(j));
                    lista.set(j, tmp);
                }
            }
        }
        return lista;
    }*/
    
    /* Alternativa suponiendo que Medicamento implemente Comparable
    
    public List<Medicamento> getMedicamentosByPeso(Consulta c) {

        List<Medicamento> listaResultado = new ArrayList<>();

        for (Medicamento m : c.getMedicamentos()) {
            listaResultado.add(m);   // Se permiten duplicados
        }

        // Orden natural definido en Medicamento.compareTo()
        Collections.sort(listaResultado);

        return listaResultado;
    } */
    
    /* Alternativa suponiendo que Medicamento implemente Comparable y además los medicamentos no se pueden repetir (se puede usar Set)
    public List<Medicamento> getMedicamentosByPeso(Consulta c) {

        Set<Medicamento> setResultado = new TreeSet<>(Comparator.reverseOrder());

        for (Medicamento m : c.getMedicamentos()) {
            setResultado.add(m);
        }

        return new ArrayList<>(setResultado);
    }*/

    
    
    //Relación UNICA (Set...) de medicamentos suministrados a un determinado animal en un intervalo de fechas
    //ordenados por orden de inserción.
   
    public Set<Medicamento> getMedicamentosByAnimal(int idAnimal,LocalDate fechaInicio, LocalDate fechaFin)
            				throws AnimalNoEncontradoException {

    		if (!consultas.containsKey(idAnimal)) {
    				throw new AnimalNoEncontradoException("Animal no encontrado");
    		}

    		Set<Medicamento> setResultado = new LinkedHashSet<>();
    		List<Consulta> listaConsultas = consultas.get(idAnimal);

    		for (Consulta c : listaConsultas) {
    			LocalDate f = c.getFecha();
    			if (!f.isBefore(fechaInicio) && !f.isAfter(fechaFin)) {
    				for (Medicamento m : c.getMedicamentos()) {
    					setResultado.add(m); // LinkedHashSet evita duplicados automáticamente
    				}
    			}
    		}

    		return setResultado;
    }

    //Devolverá un mapa donde la clave será un Propietario y el valor la lista de Animales que posee. 
    public Map<Propietario, List<Animal>> mapAnimalesByPropietario() {
        Map<Propietario, List<Animal>> mapa = new HashMap<>();

        for (Animal a : animales) {
            Propietario p = a.getPropietario();
            if (p != null) {
                if (!mapa.containsKey(p)) {
                    mapa.put(p, new ArrayList<Animal>());
                }
                mapa.get(p).add(a);
            }
        }
        return mapa;
    }

    //Devolverá la lista de animales que no tienen ninguna consulta asociada.
    public Set<Animal> getAnimalesSinConsultas() {
        Set<Animal> animalesSinConsulta = new LinkedHashSet<>();

        for (Animal a : animales) {
            List<Consulta> listaConsultasRealizadas = consultas.get(a.getId());
            if (listaConsultasRealizadas.isEmpty()) {
                animalesSinConsulta.add(a);
            }
        }
        return animalesSinConsulta;
    }
}
