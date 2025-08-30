// example showing the concept of Constructor
// parameterized constructor
import java.util.Scanner;
class Demo4{
    int rno;
    double per;
    String name;
    Demo4(int rno,double per,String name){
        this.rno=rno;
        this.per=per;
        this.name=name;
        System.out.println("Parameterized constructor called");
    }
    void display(){
        System.out.println("Roll Number : "+rno);
        System.out.println("Name : "+name);
        System.out.println("Percentage : "+per);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll number : ");
        int rno = sc.nextInt();
        
        System.out.println("Enter Percentage : ");
        double per = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter Name : ");
        String name = sc.nextLine();

        Demo4 obj = new Demo4(rno,per,name);
        obj.display();
    }
}