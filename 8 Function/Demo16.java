// example showing the concept of pass by reference
import java.util.Scanner;
class Demo16{
    int a,b; // instance variable
    void swap(Demo16 obj ){
        int temp = obj.a;
        obj.a=obj.b;
        obj.b = temp;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Demo16 obj = new Demo16();
        obj.a = a;
        obj.b = b;
       
        System.out.println("Before swapping : \na : "+obj.a+"\nb : "+obj.b);
        obj.swap(obj);
        System.out.println("After swapping in main: \na : "+obj.a+"\nb : "+obj.b);
    }
}