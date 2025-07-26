/*
    1    2  4   7   11  16  .....
*/
import java.util.Scanner;
class Demo17{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter no. of terms : ");
      int term = sc.nextInt();
      int  i , sum =1;
      for(i=0;i<term;i++){
        sum = sum + i;
        System.out.print(sum+"\t");
      }
    }
}
