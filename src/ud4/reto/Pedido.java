package ud4.reto;

public class Pedido {

    private static final int MAX_TAM = 200; //No definido en el enunciado, supondremos 200 pedidos máximo

    private Cliente cliente;
    private Pizza[] pizzas;
    private Bebida[] bebidas;
    private int numPizzas;
    private int numBebidas;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.pizzas = new Pizza[MAX_TAM];
        this.bebidas = new Bebida[MAX_TAM];
        this.numPizzas = 0;
        this.numBebidas = 0;
    }

    public void addPizza(Pizza p) {
        if (numPizzas < MAX_TAM) {
            pizzas[numPizzas++] = p;
        }
    }

    public void addBebida(Bebida b) {
        if (numBebidas < MAX_TAM) {
            bebidas[numBebidas++] = b;
        }
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }

    public String getTtfCliente() {
        return cliente.getTelefono();
    }

    public double getImporteTotal() {
        double total = 0;
        for (int i = 0; i < numPizzas; i++) total += pizzas[i].precio;
        for (int i = 0; i < numBebidas; i++) total += bebidas[i].getPrecio();
        return total;
    }


    @Override public String toString() {
    	StringBuilder sb = new StringBuilder("PEDIDO DE:\n" + cliente + "\n");
    	sb.append("\nPizzas:\n"); 
    	for (int i = 0; i < numPizzas; i++) 
    		sb.append(" - ").append(pizzas[i]).append("\n"); 
    	sb.append("\nBebidas:\n"); 
    	for (int i = 0; i < numBebidas; i++) 
    		sb.append(" - ").append(bebidas[i]).append("\n"); 
    	sb.append("Total: ").append(getImporteTotal()).append("€\n"); 
    	sb.append("----------------------------------");
    return sb.toString(); }
    
    /*
    @Override
    public String toString() {
        return "Pedido de:\n" + cliente + "\n" +
               "Pizzas:\n" + java.util.Arrays.toString(pizzas) + "\n" +
               "Bebidas:\n" + java.util.Arrays.toString(bebidas) + "\n" +
               "Total: " + getImporteTotal() + "€\n";
    }*/
    
}
