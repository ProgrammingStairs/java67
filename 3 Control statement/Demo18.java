// program switch control statement
import java.util.Scanner;
class Demo18{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter two numbers : ");
       int num1 = sc.nextInt();
       int num2 = sc.nextInt();
                
       System.out.println("Select from Below Options : ");
       System.out.println("1 for Add");
       System.out.println("2 for Sub");
       System.out.println("3 for Mul");
       System.out.println("4 for Div");
       System.out.println("5 for Mod");
       System.out.println("6 for Exit");
       
       System.out.println("Select option : ");
       int code = sc.nextInt();

       switch(code){
            case 1 : System.out.println("Add : "+(num1+num2));
                     break;
            case 2 : System.out.println("Sub : "+(num1-num2));
                     break;
            case 3 : System.out.println("Mul : "+(num1*num2));
                     break;
            case 4 : System.out.println("Div : "+(num1/num2));
                     break;
            case 5 : System.out.println("Mod : "+(num1%num2));
                     break;
            case 6 : System.out.println("Visit Again");
                     break;
            default : System.out.println("Invalid code");
                     break;
       } 
        
    }
}

