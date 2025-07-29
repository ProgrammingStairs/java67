/*
    A
    AB
    AaC
    AabD
    AabcE
    ABCDEF
*/ 
import java.util.Scanner;
class Demo11{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                if(j==1 || i==j || i==rows)
                    System.out.print((char)(64+j));
                else
                    System.out.print((char)(95+j));
            }
            System.out.println();
        }
    }
}