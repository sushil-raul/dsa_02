package dsa_02;

class Deposit {
    long Principal;
    int Time;
    double rate;
    double Total_amt;

    public Deposit() {
        Principal = 0;
        Time = 0;
        rate = 0.0;
    }

    public Deposit(long p, int t, double r) {
        Principal = p;
        Time = t;
        rate = r;
    }

    public Deposit(long p, int t) {
        Principal = p;
        Time = t;
        rate = 0.0;
    }

    public Deposit(long p, double r) {
        Principal = p;
        Time = 0;
        rate = r;
    }

    public void display() {
        System.out.println("Principal: " + Principal);
        System.out.println("Time: " + Time);
        System.out.println("Rate: " + rate);
        System.out.println("Total Amount: " + Total_amt);
    }

    public void calc_amt() {
        Total_amt = Principal + (Principal * rate * Time) / 100;
    }
}
/*public class Q5 {
    public static void main(String[] args) {
        Deposit d1 = new Deposit();
        Deposit d2 = new Deposit(10000, 2, 5.0);
        Deposit d3 = new Deposit(5000, 3);
        Deposit d4 = new Deposit(7500, 8.0);

        d1.display();
        d2.calc_amt();
        d2.display();
        d3.calc_amt();
        d3.display();
        d4.calc_amt();
        d4.display();
    }
}*/

