// example to find out factors of a number

import java.util.Scanner;
class Demo5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
      
        for(int i=1;i<=num;i++){
           if(num%i==0)
            System.out.print(i+"\t"); 
        }   
    }
}