// example showing the concept of array 
// example to check whether entered array is palindrome or not

import java.util.Scanner;
class Demo6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        int i;
        System.out.println("Enter array elements :");
        for(i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();    
        }
        System.out.println("Array elements are : ");
        for( i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");      
        }
        for(i=0;i<size/2;i++){
            if(arr[i]!=arr[size-1-i])
                break;
        }
        if(i==size/2)
            System.out.println("Array is Palindrome");
        else 
            System.out.println("Array is not palindrome");
    }
}