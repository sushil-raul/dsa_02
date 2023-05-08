package dsa_02;

import java.util.Scanner;

class Phone {
    int areaCode;
    int exchange;
    int number;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your area code, exchange, and number:");
        areaCode = sc.nextInt();
        exchange = sc.nextInt();
        number = sc.nextInt();
    }

    void display() {
        System.out.printf("Your number is (%03d) %03d-%04d\n", areaCode, exchange, number);
    }
}
public class Q1 {
    public static void main(String[] args) {
        // Create a Phone object initialized directly
        Phone myPhone = new Phone();
        myPhone.areaCode = 212;
        myPhone.exchange = 767;
        myPhone.number = 8900;
        System.out.printf("My number is (%03d) %03d-%04d\n", myPhone.areaCode, myPhone.exchange, myPhone.number);

        // Create a Phone object initialized through user input
        Phone yourPhone = new Phone();
        yourPhone.input();
        yourPhone.display();
    }
}

