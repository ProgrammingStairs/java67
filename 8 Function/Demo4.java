// example showing the concept of function
// no argument with return type

import java.util.Scanner;
class Demo4{

    int addition(){  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        return a+b;
    }

    public static void main(String args[]){
        Demo4 obj = new Demo4();
        // int res = obj.addition(); // no argument
        // System.out.println("Addition : "+res);
        System.out.println("Addition : "+obj.addition());
    }
}