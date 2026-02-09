package ud4.reto;

public class Pizza {

	private static final int MAX_INGREDIENTES = 8;
    private TamPizza tamanio;
    private Ingrediente[] ingredientes;
    private int numIngredientes; //Número de ingredientes añadidos a una determinada pizza.
    private TipoMasa masa;
    double precio; // accesible dentro del paquete

    private static int totalPizzas = 0;

    public Pizza(TamPizza tamanio, TipoMasa masa, double precio) {
        this.tamanio = (tamanio == null) ? TamPizza.MEDIANA : tamanio; //Mediana por defecto
        this.masa = masa;
        this.precio = precio;
        this.ingredientes = new Ingrediente[MAX_INGREDIENTES];
        this.numIngredientes = 0;
        totalPizzas++;
    }

    public Pizza(TipoMasa masa, double precio) {
        this(TamPizza.MEDIANA, masa, precio);
    }

    public static void mostrarTamaniosDisponibles() {
        System.out.println("Tamanios disponibles:");
        for (TamPizza t : TamPizza.values()) {
            System.out.println("- " + t);
        }
    }

    public boolean addIngrediente(Ingrediente ing) {
    	boolean insertado=false;
    	
        if (numIngredientes < MAX_INGREDIENTES) {
            ingredientes[numIngredientes++] = ing;
            insertado=true;
           
        }
        return insertado;
    }

    public int getNumIngredientes() {
        return numIngredientes;
    }

    public static int getTotalPizzas() {
        return totalPizzas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Pizza " + tamanio + " masa " + masa + " - " + precio + "€\nIngredientes:\n");
        for (Ingrediente ingrediente : ingredientes) {
        	sb.append(ingrediente != null ? ingrediente + ", " : ""); 
        }          
 
        return sb.toString();
    }
}

