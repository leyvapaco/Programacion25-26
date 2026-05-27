package ud8.examen.solucion;

public class Pago {

    private int customerNumber;
    private String checkNumber;
    private String paymentDate;
    private double amount;

    public Pago(int customerNumber, String checkNumber, String paymentDate, double amount) {
        this.customerNumber = customerNumber;
        this.checkNumber = checkNumber;
        this.paymentDate = paymentDate;
        this.amount = amount;
    }

    public int getCustomerNumber() { return customerNumber; }
    public String getCheckNumber() { return checkNumber; }
    public String getPaymentDate() { return paymentDate; }
    public double getAmount() { return amount; }

    public void setAmount(double amount) { this.amount = amount; }
}
