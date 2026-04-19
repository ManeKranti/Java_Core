public class Main {
    public static void main(String[] args){
        // Employee obj = new Employee();

        Employee kranti = new Employee();

        Employee kedar = new Employee();

        // System.out.println(obj.id);
        // System.out.println(obj.name);
        // System.out.println(obj.salary);

        // obj.id = 3;
        // obj.name = "Kirti";
        // obj.salary = 30000.48f;


        // System.out.println(kranti.id);
        // System.out.println(kranti.name);
        // System.out.println(kranti.salary);

        kranti.id = 1;
        kranti.name = "Kranti";
        kranti.salary = 40000.56f;


        // System.out.println(kedar.id);
        // System.out.println(kedar.name);
        // System.out.println(kedar.salary);

        kedar.id = 2;
        kedar.name = "Kedar";
        kedar.salary = 50000.4f;


        // obj.printDetails();
        kranti.printDetails();
        kedar.printDetails();

        
        
    }
}

class Employee{
    int id;
    String name;
    float salary;

    public void printDetails(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);

    }

}