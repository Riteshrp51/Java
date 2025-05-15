import java.util.Scanner;
import Ecommerce.Customer;
import Ecommerce.Order;
import Ecommerce.Product;

public class Test2 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Product Name: ");
            String pname = sc.nextLine();
            System.out.print("Enter Product Price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter Customer Name: ");
            String cname = sc.nextLine();
            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();
            Product p = new Product(pname, price);
            Customer c = new Customer(cname);
            Order o = new Order(c, p, qty);
            o.placeOrder();
        }
}

/*
 Enter Product Name: Mango Fruit
Enter Product Price: 55
Enter Customer Name: Raj Nikam
Enter Quantity: 5
--- Order Placed ---
Customer Name: Raj Nikam
Product Name: Mango Fruit
Price: 55.0
Quantity: 5
Total Cost: 275.0
 */