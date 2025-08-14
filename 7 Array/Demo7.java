// example showing the concept of array 
// program to merge two array

import java.util.Scanner;
class Demo7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter size of first array : ");
        int firstSize = sc.nextInt();
        System.out.println("Enter size of second array : ");
        int secondSize = sc.nextInt();

        int arrFirst[] = new int[firstSize+secondSize];
        int arrSecond[] = new int[secondSize];

        System.out.println("Enter array elements of first array :");
        for(i=0;i<firstSize;i++){
            arrFirst[i] = sc.nextInt();    
        }
        System.out.println("Enter array elements of second array :");
        for(i=0;i<secondSize;i++){
            arrSecond[i] = sc.nextInt();    
        }
        
        for( i=0;i<secondSize;i++,firstSize++){
           arrFirst[firstSize] = arrSecond[i];      
        }
        System.out.println("\nArray elements of Merge array :\n");
        for(i=0;i<firstSize;i++){
            System.out.print(arrFirst[i]+"\t");    
        }

    }
}