//Write a Java programming to create a e-commerce system with three classes product customer and order, online product and physical product are implementation of Product interface. procuct intrface has list of product as method for adding them. Product should be the iterface with methods show product, addproduct, delete product, and claculate product prize
package com.lab5;

import java.util.ArrayList;
import java.util.List;
// create interface 
interface Product 
{
    void showProduct();// create method
    double calculatePrice(); // create method
}
// create class OnlineProduct implements with Product interface
class OnlineProduct implements Product 
{
    // declare variables
    private final int productId;
    private final String name;
    private final double price;
    private final double shippingCost;
    
    //create parameterised constructor 
    public OnlineProduct(int productId, String name, double price, double shippingCost) 
    {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.shippingCost = shippingCost;
    }

    @Override
    public void showProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: Rs." + price);
        System.out.println("Shipping Cost: Rs." + shippingCost);
    }

    @Override
    public double calculatePrice() {
        return price + shippingCost;
    }
}
// create class PhysicalProduct which implements Product interface
class PhysicalProduct implements Product
{
    // dclare ariables
    private final int productId;
    private final String name;
    private final double price;
    private final double weight;
    //create parametrised constructor
    public PhysicalProduct(int productId, String name, double price, double weight) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public void showProduct() // create method
    {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: Rs." + price);
        System.out.println("Weight: " + weight + " kg");
    }

    @Override
    public double calculatePrice() // create method
    {
        return price;
    }
}
//create class
 class Customer
 {
     
    // declae variables
    private final int customerId;
    final String name;
    private final String address;
    // create parametrised  constructor
    public Customer(int customerId, String name, String address)
    {
        // this-> refer to current class
        this.customerId = customerId;
        this.name = name;
        this.address = address;
    }
}
// create class Order 
 class Order
 {
     // declare variables
    private final int orderId;
    private final Customer customer;
    private final List<Product> products;

    // create parametrised constructor
    public Order(int orderId, Customer customer)
    {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

     void addProduct(Product product)
     {
        products.add(product);
    }

    public double calculateTotal() 
    {
        double total = 0;
        for (Product product : products) {
            total += product.calculatePrice();
        }
        return total;
    }

    public void showOrder()// create  method
    {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.name);
        System.out.println("Products:");
        for (Product product : products) // for each loop
        {
            product.showProduct();
            System.out.println();
        }
        System.out.println("Total Price: Rs." + calculateTotal());
    }
}
// main class
public class Pro_Product
{
    public static void main(String[] args)
    {
        // create Customer class's object
        Customer customer1 = new Customer(1, "Nivedita", "Solapur");
        // create Order class's object
        Order order1 = new Order(100, customer1);
        
        order1.addProduct(new OnlineProduct(1, "Laptop", 500, 20));
        order1.addProduct(new PhysicalProduct(2, "Headphones", 100, 0.5));

        order1.showOrder();
    }
}

/**Dry Run:
 * Order ID: 100
Customer: Nivedita
Products:
Product ID: 1
Name: Laptop
Price: Rs.500.0
Shipping Cost: Rs.20.0

Product ID: 2
Name: Headphones
Price: Rs.100.0
Weight: 0.5 kg

Total Price: Rs.620.0*/
