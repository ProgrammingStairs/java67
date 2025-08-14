// example showing the concept of array 
// sum of first and last element of an array

import java.util.Scanner;
class Demo3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter array elements :");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();    
        }
        int sum=0;
        System.out.println("Array elements are : ");
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            System.out.print(arr[i]+"\t");      
        }
        System.out.println("\nSum of all elements : "+sum);
        System.out.println("Sum of first and last : "+(arr[0]+arr[size-1]));
    }
}