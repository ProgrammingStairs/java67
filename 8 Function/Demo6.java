// example showing the concept of function
// with argument with return type

import java.util.Scanner;
class Demo6{

    int addition(int a,int b){  // parameter | formal parameter | formal argument
        return a+b;
    }

    public static void main(String args[]){
        Demo6 obj = new Demo6();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Addition : "+obj.addition(a,b)); // argument | actual parameter | actual argument
    }
}