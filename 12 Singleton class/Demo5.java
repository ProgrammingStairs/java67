// example showing the concept of jagged array
import java.util.Scanner;
class Demo5{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no. of rows : ");
    int rows = sc.nextInt();
    int arr[][] = new int[rows][];

    for(int i=0;i<arr.length;i++){
        System.out.println("Enter no. of columns for "+(i+1)+" row : ");
        int col = sc.nextInt();
        arr[i] = new int[col];
        System.out.println("Enter elements for "+(i+1)+" column : ");
        for(int j=0;j<col;j++){
            arr[i][j] = sc.nextInt();
        }
    }

    System.out.println("Array elements are : ");
    for(int ar[] : arr){
        for(int element : ar)
            System.out.print(element+"\t");
        System.out.println();
    }
    }
}

/*
2d array ---------special type of 2d array ----- Jagged Array

int arr[][] = new int[5][];
arr.length = no. of rows = 5

arr[0] = new int[]{ 1 ,  2 ,  3 }
arr[1] = new int[]{ 3 ,  4 ,  6 ,  8  , 9 ,  7}
arr[2] = new int[]{ 7 ,  8 ,  9 ,  8  , 7}
arr[3] = new int[]{ 2 ,  4 }  
arr[4] = new int[]{ 8 ,  6 ,  7  , 6}
*/