// example showing the concept of method reference

import java.util.Scanner;
interface Showable{
    int calculate(int a,int b);
}
class Demo5 {
    int sum(int a,int b){
        return a+b;
    }
    static int sub(int a,int b){
        return a-b;
    }
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter values of a and b : ");
            int a = sc.nextInt();
            int b = sc.nextInt();

        Showable obj; 
        obj = new Demo5() :: sum; // reference to an instance method
        System.out.println("Sum : "+obj.calculate(a,b));

        obj = Demo5 :: sub; // reference to a static method
        System.out.println("Sub : "+obj.calculate(a,b));
   }
}