package ra6y7.recuperacion.junio1;

import java.util.*;

public class Empresa {

    private List<Equipaje> vendidos = new ArrayList<>();
    private Map<String, Set<Accesorio>> accesorios = new HashMap<>(); //Clave: Código equipaje

    public Empresa() {
    	//Nada a inicializar.
    }
    // Añadir equipaje vendido (puede repetirse)
    public void addVendido(Equipaje e) {
        vendidos.add(e);
    }

    // Eliminar un equipaje vendido (solo una ocurrencia)
    public boolean delVendido(Equipaje e) {
        return vendidos.remove(e);
    }


 // Mostrar vendidos ordenados por altura decreciente
    public void mostrarVendidos() {

        // Orden natural ascendente (por altura)
        Collections.sort(vendidos);

        // Invertir para obtener orden decreciente
        Collections.reverse(vendidos);

        // Mostrar
        for (Equipaje e : vendidos) {
            System.out.println(e);
        }
    }


    // Añadir accesorio a un equipaje
    public void addAccesorio(String codigoEq, Accesorio a) {

        // Si no existe el código, crear el Set manualmente
        if (!accesorios.containsKey(codigoEq)) {
            accesorios.put(codigoEq, new HashSet<Accesorio>());
        }

        // Añadir al Set
        Set<Accesorio> conjunto = accesorios.get(codigoEq);
        conjunto.add(a);
    }

    // Eliminar accesorio
    public boolean delAccesorio(String codigoEq, Accesorio a) {

        if (!accesorios.containsKey(codigoEq)) {
            return false;
        }

        Set<Accesorio> conjunto = accesorios.get(codigoEq);
        return conjunto.remove(a);
    }

    // Mostrar accesorios ordenados por precio
    public void mostrarAccesorios(String codigoEq) {

        if (!accesorios.containsKey(codigoEq)) {
            System.out.println("Equipaje no existe");
            return;
        }

        Set<Accesorio> conjunto = accesorios.get(codigoEq);

        // Pasar el Set a una lista para poder ordenar
        List<Accesorio> lista = new ArrayList<>(conjunto);

        Collections.sort(lista, new Comparator<Accesorio>() {
            @Override
            public int compare(Accesorio a1, Accesorio a2) {
                return Double.compare(a1.getPrecio(), a2.getPrecio());
            }
        });

        for (Accesorio a : lista) {
            System.out.println(a);
        }
    }
    
    //Alternativa: Usando un TreeSet
    public void mostrarAccesorios2(String codigoEq) {

        if (!accesorios.containsKey(codigoEq)) {
            System.out.println("Equipaje no existe");
            return;
        }

        Set<Accesorio> conjunto = accesorios.get(codigoEq);

        // TreeSet ordenado solo por precio
        Set<Accesorio> ordenados = new TreeSet<>(new Comparator<Accesorio>() {
            @Override
            public int compare(Accesorio a1, Accesorio a2) {
                return Double.compare(a1.getPrecio(), a2.getPrecio());
            }
        });

        ordenados.addAll(conjunto);

        for (Accesorio a : ordenados) {
            System.out.println(a);
        }
    }

    public double[] volumenesVendidos() {

        // Crear un array del mismo tamaño que la lista de vendidos
        double[] vol = new double[vendidos.size()];

        // Rellenar el array con los volúmenes de cada equipaje
        for (int i = 0; i < vendidos.size(); i++) {
            vol[i] = vendidos.get(i).calcularVolumen();
        }

        return vol;
    }

}

