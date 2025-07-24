// example to check whether entered number is prime or not

import java.util.Scanner;
class Demo7{
    public static void main(String args[]){
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        for(i=2;i<=num/2;i++){
           if(num%i==0)
                break;
        }   
        if(i>num/2 && num>1)
            System.out.println("Number is prime"); 
        else 
            System.out.println("Number is not prime"); 
    }
}