// program switch control statement
import java.util.Scanner;
class Demo17{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter color : ");
       String color = sc.next();

       switch(color.toLowerCase()){
            case "red" : System.out.println("its red color");
                        break;
            case "green" : System.out.println("its green color");
                        break;
            default :   System.out.println("Invalid");
                        break;
       }        
    }
}

