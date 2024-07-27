import java.util.Scanner;

public class XYZ {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of inputs:");
        int n =sc.nextInt();
        Product[] products= new Product[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the details of product:");
            System.out.print("Enter Product ID: ");
            int pid = sc.nextInt();
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();
            products[i] = new Product(pid,price,quantity);

        }
        int highestPricePid = getPidOfHighestPriceProduct(products);
        System.out.println("Product ID with the highest price: " + highestPricePid);
        double totalAmount = calculateTotalAmountSpent(products);
        System.out.println("Total amount spent on all products: " + totalAmount);
    }

    // Method to find PID of the product with the highest price
    public static int getPidOfHighestPriceProduct(Product[] products) {
        if (products == null || products.length == 0) {
            return 0;
        }

        Product maxPriceProduct = products[0];

        for (Product product : products) {
            if (product.getPrice() > maxPriceProduct.getPrice()) {
                maxPriceProduct = product;
            }
        }

        return maxPriceProduct.getPid();
    }

    // Method to calculate total amount spent on all products
    public static double calculateTotalAmountSpent(Product[] products) {
        double totalAmount = 0.0;

        for (Product product : products) {
            totalAmount += product.getPrice() * product.getQuantity();
        }

        return totalAmount;
    }
}
