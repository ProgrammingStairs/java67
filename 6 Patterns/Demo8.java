/*
    A        65                64+1
    AB       65 66             64+1 64+2
    ABC      65 66 67          64+1 64+2 64+3
    ABCD     65 66 67 68       64+1 64+2 64+3 64+4
    ABCDE    65 66 67 68 69    64+1 64+2 64+3 64+4 64+5
*/ 
import java.util.Scanner;
class Demo8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(64+j));
            }
            System.out.println();
        }
    }
}