// example to print fibonacci series
import java.util.Scanner;
class Demo16{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter no. of terms : ");
      int term = sc.nextInt();
      int a = -1,b = 1, c , i ;
      for(i=1;i<=term;i++){
        c = a + b;
        System.out.print(c+"\t");
            a = b;
            b = c;
      }
    }
}
