package dsa_02;

class RestaurantMeal {
    String name;
    double price;

    RestaurantMeal(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class HotelService {
    String name;
    double serviceFee;
    int roomNumber;

    HotelService(String name, double serviceFee, int roomNumber) {
        this.name = name;
        this.serviceFee = serviceFee;
        this.roomNumber = roomNumber;
    }
}

class RoomServiceMeal extends HotelService {
    RestaurantMeal meal;

    RoomServiceMeal(String name, double price, int roomNumber) {
        super("room service", 24.0, roomNumber);
        this.meal = new RestaurantMeal(name, price);
    }

    void display() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Service: " + name + " (Rs " + serviceFee + ")");
        System.out.println("Meal: " + meal.name + " (Rs " + meal.price + ")");
        System.out.println("Total: Rs " + (meal.price + serviceFee));
    }
}
public class QH5 {
    public static void main(String[] args) {
        RoomServiceMeal meal = new RoomServiceMeal("steak dinner", 600.0, 1202);
        meal.display();
    }
}
