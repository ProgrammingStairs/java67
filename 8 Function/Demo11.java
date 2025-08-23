// example showing the concept of getter and setter method

import java.util.Scanner;
class Student{
    private int rno;
    private double per;
    private String name;

    // setter methods
    void setRno(int rno){
        this.rno=rno;
    }
    void setPer(double per){
        this.per=per;
    }
    void setName(String name){
        this.name=name;
    }
    
    // getter methods
    int getRno(){
        return rno;
    }
    double getPer(){
        return per;
    }
    String getName(){
        return name;
    }
}
class Demo11{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll Number : ");
        int rno = sc.nextInt();
        
        sc.nextLine();
        System.out.println("Enter Name : ");
        String name = sc.nextLine();

        System.out.println("Enter Percentage : ");
        double per = sc.nextDouble();

        Student s1 = new Student();
        s1.setRno(rno);
        s1.setPer(per);
        s1.setName(name);

        System.out.println("Student Details : ");
        System.out.println("Roll Number : "+s1.getRno());
        System.out.println("Percentage : "+s1.getPer());
        System.out.println("Name : "+s1.getName());
    }
}