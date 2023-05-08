package dsa_02;

interface DetailInfo {
    void display();

    int count();
}

class Personn implements DetailInfo {
    static int maxcount;
    String name;

    Personn(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }

    public int count() {
        return name.length();
    }
}

public class Q8 {
    public static void main(String[] args) {
        Personn Personn = new Personn("John Doe");
        Personn.display();
        System.out.println("Character count: " + Personn.count());
    }
}