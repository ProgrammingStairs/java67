// example showing the concept of function
// with argument no return type

import java.util.Scanner;
class Demo5{

    void addition(int a,int b){  
        System.out.println("Addition : "+(a+b));
    }

    public static void main(String args[]){
        Demo5 obj = new Demo5();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        obj.addition(a,b); // with argument
    }
}