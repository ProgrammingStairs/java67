// example showing the concept of function

import java.util.Scanner;
class Demo8{
    int[][] printData(){
        return new int[][]{
            {1,2},
            {3,4}
        };
    }
    public static void main(String args[]){
        Demo8 obj = new Demo8();
        int arr[][] = obj.printData();
        System.out.println("Array elements are : ");
        for(int ar[] : arr){
            for(int element : ar)
                System.out.print(element+"\t");
            System.out.println();
        }
            
    }
}