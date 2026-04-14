package ra4y7.garaje.solucion;

public class Principal {

    public static void main(String[] args) {

        Garaje g = new Garaje();

        // Vehículos terrestres
        Coche c1 = new Coche("La Jeepeta", 5, "1234ABC", 2010, Color.AZUL);
        Coche c2 = new Coche("Rayo", 4, "5678DEF", 2015, Color.ROJO);

        Motocicleta m1 = new Motocicleta("Furia", 1, "2222BBB", 2020, Color.AMARILLO);
        Motocicleta m2 = new Motocicleta("Trueno", 1, "3333CCC", 2018, Color.ROJO);

        // Comparaciones directas
        System.out.println("Comparación matrícula c1 vs c2: " + c1.compareTo(m2));
        System.out.println("Comparación matrícula m1 vs m2: " + m1.compareTo(m2));

        System.out.println("Comparación año c1 vs c2: " + Terrestre.compararPorAnio(c1, c2));
        System.out.println("Comparación año m1 vs m2: " + Terrestre.compararPorAnio(m1, m2));

        // Vehículos aéreos
        Helicoptero h1 = new Helicoptero("Halcón", 10, 500, "UP-A300I");
        Avioneta a1 = new Avioneta("Nube Blanca", 4, 1200, "UP-B200X");

        // Garaje
        g.entrar(c1);
        g.entrar(m1); // debe fallar
        g.salir();
        g.entrar(m1);

        // Añadir personas al helicóptero
        h1.transportar(2);

        System.out.println("\nHELICÓPTERO:");
        System.out.println(h1);
        System.out.println(h1.volar());

        System.out.println("\nVehículos aéreos creados: " + Aereo.getTotalAereos());

        System.out.println("\nESTADO DEL GARAJE:");
        g.mostrarEstado();
    }
}
