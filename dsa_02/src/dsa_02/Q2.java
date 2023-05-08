package dsa_02;

class Complex {
    double real;
    double imag;

    void setData(double r, double i) {
        real = r;
        imag = i;
    }

    void display() {
    	System.out.println(real + " + " + imag + "i");
    }

    Complex add(Complex c) {
        Complex result = new Complex();
        result.real = real + c.real;
        result.imag = imag + c.imag;
        return result;
    }
}
public class Q2 {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        c1.setData(2.5, 3.7);
        System.out.print("First complex number: ");
        c1.display();

        Complex c2 = new Complex();
        c2.setData(-1.8, 4.3);
        System.out.print("Second complex number: ");
        c2.display();

        Complex sum = c1.add(c2);
        System.out.print("Sum of the two complex numbers: ");
        sum.display();
    }
}
