// example showing the concept of inheritance
// hierarchical inheritance

import java.util.Scanner;
class Person{
    int age;
    String name;
    void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name : ");
        name = sc.nextLine();

        System.out.println("Enter Age : ");
        age = sc.nextInt();
    }
    void showDetails(){
        System.out.println("\nName : "+name);
        System.out.println("Age : "+age);
    }
}
class Student extends Person{
    int fees;
    String course;
    void getStudDetails(){
        getDetails();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Course Name : ");
        course = sc.nextLine();

        System.out.println("Enter Fees : ");
        fees = sc.nextInt();
    }
    void showStudDetails(){
        showDetails();
        System.out.println("\nCourse : "+course);
        System.out.println("Fees : "+fees);
    }
}
class Employee extends Person{
    int salary;
    String desig;
    void getEmpDetails(){
        getDetails();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Designation : ");
        desig = sc.nextLine();

        System.out.println("Enter Salary : ");
        salary = sc.nextInt();
    }
    void showEmpDetails(){
        showDetails();
        System.out.println("\nDesignation : "+desig);
        System.out.println("Salary : "+salary);
    }
}

class Demo5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.println("-----------------------------------");
        s.getStudDetails();
        System.out.println("-----------------------------------");
        Employee e = new Employee();
        e.getEmpDetails();
        System.out.println("-----------------------------------");

        s.showStudDetails();
        System.out.println("-----------------------------------");

        e.showEmpDetails();
    }
}
