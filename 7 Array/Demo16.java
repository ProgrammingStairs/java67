// example showing the concept of multidimensional array 
import java.util.Scanner;
class Demo16{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of 2d matrix, rows and columns : ");
        int num = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        
        int arr[][][]= new int[num][r][c]; 

        System.out.println("Enter Array elements : \n");
        for(int i=0;i<num;i++){ // no. of 2d matrix
            for(int j=0;j<r;j++){ // no. of rows
                for(int k=0;k<c;k++) // no. of columns
                    arr[i][j][k]=sc.nextInt();
            }
        }
        System.out.println("\nArray elements are : \n");
        for(int ar[][] : arr){
            for(int a[] : ar){
                for(int element : a)
                    System.out.print(element+"\t");
                System.out.println();
            }
            System.out.println();
        }
    }
}