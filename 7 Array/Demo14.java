// example showing the concept of adding two 2d array 
import java.util.Scanner;
class Demo14{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        
        int arr1[][]= new int[r][c];    
        int arr2[][]= new int[r][c];    
        int arr3[][]= new int[r][c];    

        System.out.println("Enter first Array elements : \n");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter second Array elements : \n");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr2[i][j]=sc.nextInt();
            }
        }

        System.out.println("\nFirst Array elements are : \n");
        for(int ar[] : arr1){
            for(int element : ar){
                System.out.print(element+"\t");
            }
            System.out.println();
        }
        System.out.println("\nSecond Array elements are : \n");
        for(int ar[] : arr2){
            for(int element : ar){
                System.out.print(element+"\t");
            }
            System.out.println();
        }

        // addition and printing of resultant array
        System.out.println("Resultant Array elements are : \n");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arr3[i][j]+"\t");
            }
            System.out.println();
        }

    }
}