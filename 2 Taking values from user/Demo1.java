// Example to take values from user

import java.util.Scanner;
class Demo1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int num2 = sc.nextInt();

        System.out.println("sum : "+num1+num2);
        System.out.println(num1+num2);
        System.out.println(num1+num2+" : Sum");
        System.out.println("sum : "+(num1+num2));
     
    }
}