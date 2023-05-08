package dsa_02;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    int Eid;
    double salary;

    Employee(String name, int age, int Eid, double salary) {
        super(name, age);
        this.Eid = Eid;
        this.salary = salary;
    }

    void empDisplay() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + Eid);
        System.out.println("Salary: " + salary);
    }
}
/*public class Q7{
	public static void main(String[] args) {
	    // create a Person object
	    Person person = new Person("John Doe", 25);
	    
	    // create an Employee object
	    Employee employee = new Employee("Jane Smith", 30, 12345, 50000.00);
	    
	    // display employee details
	    employee.empDisplay();
	}
}*/

