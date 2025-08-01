/*
    12345
    1  4
    1 3
    12
    1
*/ 
import java.util.Scanner;
class Demo15{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int rows = sc.nextInt();
        for(int i=rows;i>=1;i--){
            for(int j=1;j<=i;j++){
                if(j==1 || i==j || i==rows)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}