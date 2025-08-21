// example showing the concept of function

import java.util.Scanner;
class Demo7{
    int[] printData(){
        // int arr[] = {1,2,3,4,5};
        // return arr;
    
        return new int[]{1,2,3,4,5,6,7,8};
    }
    public static void main(String args[]){
        Demo7 obj = new Demo7();
        int arr[] = obj.printData();
        System.out.println("Array elements are : ");
        for(int element : arr)
            System.out.print(element+"\t");
    }
}