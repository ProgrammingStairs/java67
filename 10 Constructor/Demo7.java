// example showing the concept of Constructor
// concept of copy constructor
import java.util.Scanner;
class Demo7{
    int rno;
    double per;
    String name;
    Demo7(int rno,double per,String name){
        this.rno=rno;
        this.per=per;
        this.name=name;
        System.out.println("Parameterized constructor called");
    }
    Demo7(){}
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

        Demo7 obj = new Demo7(rno,per,name);
        Demo7 objNew = new Demo7();
        obj.display();

        objNew.rno = obj.rno;
        objNew.per = obj.per;
        objNew.name = obj.name;
        
        System.out.println("After Copying : ");
        objNew.display();
    }
}



