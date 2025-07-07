// example showing the concept of if else statement 
import java.util.Scanner;
class Demo6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Experience : ");
        int exp = sc.nextInt();

        System.out.println("Enter Salary : ");
        int sal = sc.nextInt();

        if(sal>=25000 && exp>=3)
            System.out.println("Gets Hike");
        else
            System.out.println("Not eligible to get Hike");
    }
}