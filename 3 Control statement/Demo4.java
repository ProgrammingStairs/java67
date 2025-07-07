// example showing the concept of if statement 
import java.util.Scanner;
class Demo4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();

        System.out.println("Enter second number : ");
        int b = sc.nextInt();

        if(a==b)
            System.out.println("Both are equal");

        if(a>b)
            System.out.println(a+" is greater");

        if(a<b)
            System.out.println(b+" is greater");
    }
}