    class Employee{
    String name ;
    double salary ;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("Constructor Executed");
    }

    Employee(Employee emp) {
        this.name = emp.name;
        this.salary = emp.salary;
        System.out.println("Copy constructor Executed");
    }

    

    void displayDetails(){
        System.out.println("Employee name "+ name + " Salary "+ salary);
    }
    
}



public class Main {
    public static void main(String[] args) {

        System.out.println("Object creation start");

        Employee emp1 = new Employee("Kranti",  5000);

        System.out.println("Object creation end");
        emp1.displayDetails();

        Employee emp2 = new Employee(emp1);
        emp2.displayDetails();
        emp2.name = "Rutuja";
        emp2.displayDetails();

        System.out.println("End Program");

    }
}