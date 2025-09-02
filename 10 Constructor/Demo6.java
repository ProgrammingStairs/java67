// example showing the concept of Constructor
// concept of copy constructor
import java.util.Scanner;
class Demo6{
    int rno;
    double per;
    String name;
    Demo6(int rno,double per,String name){
        this.rno=rno;
        this.per=per;
        this.name=name;
        System.out.println("Parameterized constructor called");
    }
    Demo6(Demo6 obj){
        rno = obj.rno;
        per = obj.per;
        name = obj.name;
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

        Demo6 obj = new Demo6(rno,per,name);
        Demo6 objNew = new Demo6(obj);
        obj.display();
        System.out.println("After Copying : ");
        objNew.display();
    }
}



