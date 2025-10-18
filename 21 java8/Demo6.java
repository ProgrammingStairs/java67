// example showing the concept of method reference

import java.util.Scanner;
interface Showable{
    void calculate(int a,int b);
}
class Demo6 {
    Demo6(int a,int b){
        System.out.println("Mul : "+(a*b));
    }
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter values of a and b : ");
            int a = sc.nextInt();
            int b = sc.nextInt();

        Showable obj; 
        obj = Demo6 :: new; // reference to a constructor
        obj.calculate(a,b);
    }
}