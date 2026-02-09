package ud4.reto;

public class Pizzeria {

    private Pedido[] pedidos;
    private int numPedidos;

    public Pizzeria() {
        this(5); //Invoca al otro constructor de la clase que admite como parámetro la capacidad.
    }

    public Pizzeria(int capacidad) {
        pedidos = new Pedido[capacidad];
        numPedidos = 0;
    }

    public void addPedido(Pedido p) {
        if (numPedidos < pedidos.length) {
            pedidos[numPedidos++] = p;
        }
    }

    public void mostrarPedidosSuperioresA(double importe) {
        for (int i = 0; i < numPedidos; i++) {
            if (pedidos[i].getImporteTotal() > importe) {
                System.out.println(pedidos[i].toString());
            }
        }
    }

    public int getTotalPedidos() {
        return numPedidos;
    }

    // Pedido rapido del producto estrella
    public Pedido crearPedidoEstrella(Cliente c) {
        Pedido p = new Pedido(c);
        Pizza estrella = new Pizza(TamPizza.FAMILIAR, TipoMasa.FINA, 18.0);
        estrella.addIngrediente(new Ingrediente(Producto.CHICHARRONES_DE_CAI, 500, false));
        p.addPizza(estrella);
        addPedido(p);
        return p;
    }
}

