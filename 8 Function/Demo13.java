// example showing the concept of recursion

import java.util.Scanner;
class Demo13{
    // recursive function
    int fact(int n){
        if(n==0)
            return 1;
        else    
            return n*fact(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        Demo13 obj = new Demo13();
        System.out.println("Factorial : "+obj.fact(num)); 
    }
}