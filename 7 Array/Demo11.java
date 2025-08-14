// example showing the concept of 2d array 
import java.util.Scanner;
class Demo11{
    public static void main(String args[]){
        int arr[][]= {
            {1,2,3},
            {3,4,5},
            {5,6,7}
        };    

        System.out.println("Array elements are : \n");
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         System.out.print(arr[i][j]+"\t");
        //     }
        //     System.out.println();
        // }

        for(int ar[] : arr){
            for(int element : ar){
                System.out.print(element+"\t");
            }
            System.out.println();
        }
    }
}