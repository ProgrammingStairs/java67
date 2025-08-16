// example showing the concept of multiplying two 2d array 
import java.util.Scanner;
class Demo15{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns of first array: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("Enter rows and columns of second array: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        
        if(c1==r2){
        int arr1[][]= new int[r1][c1];    
        int arr2[][]= new int[r2][c2];    
        int arr3[][]= new int[r1][c2];    

        System.out.println("Enter first Array elements : \n");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter second Array elements : \n");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
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

        // multiplication and printing of resultant array
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                arr3[i][j] = 0;
                for(int k=0;k<c1;k++){
                    arr3[i][j] = arr3[i][j] + arr1[i][k] * arr2[k][j];
                }
            }
        }
        
        System.out.println("\nResultant Array elements are : \n");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(arr3[i][j]+"\t");
            }
            System.out.println();
        }
        }else 
            System.out.println("Matrix multiplication not possible");
    }
}