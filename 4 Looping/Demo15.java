// example showing the concept of do while loop
import java.util.Scanner;
class Demo15{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      char ch;
      int sum=0;
      do{
          System.out.println("Enter number : ");
          int num = sc.nextInt(); 
      
          System.out.println("Do you want to continue ?\nIf yes Press y/Y : ");
          ch = sc.next().charAt(0);
          sum = sum + num;  

      }while(ch == 'y' || ch=='Y');
      System.out.println("\nSum : "+sum);  
    }
}
