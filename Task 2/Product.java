public class Product {
    private int pid, quantity;
    private double price;
    public Product(int pid,double price,int quantity)
    {
        this.pid=pid;
        this.price=price;
        this.quantity =quantity;
    }
    public int getPid() {
        return pid;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
