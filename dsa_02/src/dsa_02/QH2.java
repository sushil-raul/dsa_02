package dsa_02;

class Book {
    String BName;
    int BEdition;
    double BPrice;

    Book(String BName, int BEdition, double BPrice) {
        this.BName = BName;
        this.BEdition = BEdition;
        this.BPrice = BPrice;
    }

    void display() {
        System.out.println("Book Name: " + BName);
        System.out.println("Book Edition: " + BEdition);
        System.out.println("Book Price: " + BPrice);
    }
}

public class QH2 {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("Book 1", 1, 10.99);
        books[1] = new Book("Book 2", 2, 12.99);
        books[2] = new Book("Book 3", 3, 15.99);
        books[3] = new Book("Book 4", 4, 9.99);
        books[4] = new Book("Book 5", 5, 7.99);

        Book maxPriceBook = books[0];
        for (int i = 1; i < books.length; i++) {
            if (books[i].BPrice > maxPriceBook.BPrice) {
                maxPriceBook = books[i];
            }
        }

        System.out.println("Book with Maximum Price:");
        maxPriceBook.display();
    }
}