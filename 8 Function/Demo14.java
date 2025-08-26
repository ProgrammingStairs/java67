// example showing the concept of pass by value
/*
    pass by value : 
        1. In pass by value, calling is done by passing values.
        2. In pass by value, copy of original data is going to be pass.
        3. In pass by value, changes made on copied data does not reflect on original data. 
*/

import java.util.Scanner;
class Demo14{
    void swap(int a,int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println("After swapping in swap : \na : "+a+"\nb : "+b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Demo14 obj = new Demo14();
        System.out.println("Before swapping : \na : "+a+"\nb : "+b);
        obj.swap(a,b);
        System.out.println("After swapping in main: \na : "+a+"\nb : "+b);
    }
}