package dsa_02;
import java.util.Scanner;

 class Commission {
    private double sales;

    public Commission(double sales) {
        this.sales = sales;
    }

    public double getCommission() {
        if (sales < 0) {
            System.out.println("Invalid Input");
            return 0;
        } else if (sales < 100) {
            return sales * 0.02;
        } else if (sales < 5000) {
            return sales * 0.05;
        } else {
            return sales * 0.08;
        }
    }
}


public class QH1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the sales in Rs: ");
        double sales = scanner.nextDouble();
  
        Commission commission = new Commission(sales);
        System.out.println("Commission: " + commission.getCommission()+" Rs");
    }
}
