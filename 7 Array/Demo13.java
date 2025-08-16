// example showing the concept of 2d array 
import java.util.Scanner;
class Demo13{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][]= new int[r][c];    

        System.out.println("Enter Array elements : \n");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("\nArray elements are : \n");
        for(int ar[] : arr){
            for(int element : ar){
                System.out.print(element+"\t");
            }
            System.out.println();
        }
        System.out.println("sum : "+(arr[0][0]+arr[r-1][0]+arr[0][c-1]+arr[r-1][c-1]));
    }
}