// example showing the concept of function
// no argument no return type

import java.util.Scanner;
class Demo3{

    void addition(){ // doesn't return any value 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition : "+(a+b));
    }

    public static void main(String args[]){
        Demo3 obj = new Demo3();
        obj.addition(); // no argument
    }
}