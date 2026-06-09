package ud8.tarea3;

public class Pedido {

    private int orderNumber;
    private String orderDate;       // formato YYYY-MM-DD
    private String requiredDate;    // formato YYYY-MM-DD
    private String status;          // p.e. "In Process"
    private int customerNumber;

    public Pedido(int orderNumber, String orderDate, String requiredDate,
                  String status, int customerNumber) {
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.status = status;
        this.customerNumber = customerNumber;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getRequiredDate() {
        return requiredDate;
    }

    public String getStatus() {
        return status;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }
}
