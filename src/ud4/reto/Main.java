package ud4.reto;

public class Main {

    public static void main(String[] args) {

        // Mostrar tamanios disponibles
        Pizza.mostrarTamaniosDisponibles();

        // Crear pizzeria
        Pizzeria pizzeriaPinoccio = new Pizzeria();

        // Crear cliente
        Cliente cli1 = new Cliente("Pepe", "Calle Luna 3", "654321987");

        // Crear pedido manual
        Pedido ped1 = new Pedido(cli1);

        // Crear pizza
        Pizza pizza1 = new Pizza(TamPizza.MEDIANA, TipoMasa.NORMAL, 12.5);
        pizza1.addIngrediente(new Ingrediente(Producto.ATUN, 80, false));
        pizza1.addIngrediente(new Ingrediente(Producto.CHISTORRA, 200, true));
        pizza1.addIngrediente(new Ingrediente()); // queso por defecto

        ped1.addPizza(pizza1);

        // Crear bebidas
        Bebida agua = new Agua(1.0, false);
        Bebida cola = new Refresco("Cola", 2.0, false);

        ped1.addBebida(agua);
        ped1.addBebida(cola);

        // Añadir pedido a la pizzeria
        pizzeriaPinoccio.addPedido(ped1);

        // Crear pedido rapido del producto estrella
        Cliente cli2 = new Cliente("Maria", "Av. Verde 12", "600112233");
        pizzeriaPinoccio.crearPedidoEstrella(cli2); //Crea la pizza de chicharrones

        // Mostrar pedidos superiores a un importe
        System.out.println("\nPedidos superiores a 15 euros:");
        pizzeriaPinoccio.mostrarPedidosSuperioresA(15);

        // Mostrar total de pedidos
        System.out.println("\nTotal de pedidos realizados: " + pizzeriaPinoccio.getTotalPedidos());

        // Mostrar total de pizzas creadas
        System.out.println("Total de pizzas creadas: " + Pizza.getTotalPizzas());
    }
}

