// example showing the concept of array 
// Example to find out min and max element

import java.util.Scanner;
class Demo4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter array elements :");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();    
        }
        int min = arr[0],max = arr[0];
        System.out.println("Array elements are : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");      
            if(min>arr[i])
                min = arr[i];

            if(max<arr[i])
                max = arr[i];
        }
        System.out.println("\nMinimum Element : "+min);
        System.out.println("\nMaximum Element : "+max);
    }
}