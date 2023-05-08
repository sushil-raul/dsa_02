package dsa_02;

import java.util.Scanner;

class product {
    int pid;
    double price;
    static double tot_price = 0;

    product(int pid, double price) {
        this.pid = pid;
        this.price = price;
    }

    void display() {
        System.out.println("Product ID: " + pid);
        System.out.println("Product Price: $" + price);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        product[] products = new product[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter product ID and price for product " + (i + 1));
            int pid = sc.nextInt();
            double price = sc.nextDouble();
            products[i] = new product(pid, price);
            product.tot_price += price;
        }

        System.out.println("\nDetails of the products purchased:");
        for (int i = 0; i < 5; i++) {
            products[i].display();
            System.out.println();
        }

        System.out.println("Total amount to be paid: $" + product.tot_price);
    }
}
