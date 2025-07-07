// example showing the concept of if else statement 
import java.util.Scanner;
class Demo5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();

        System.out.println("Enter second number : ");
        int b = sc.nextInt();

        if(a>b)
            System.out.println(a+" is greater");
        else
            System.out.println(b+" is greater...");
    }
}