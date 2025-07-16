// program switch control statement
import java.util.Scanner;
class Demo19{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter two numbers : ");
       int num1 = sc.nextInt();
       int num2 = sc.nextInt();
                
       System.out.println("Select from Below Options : ");
       System.out.println("+ for Add");
       System.out.println("- for Sub");
       System.out.println("* for Mul");
       System.out.println("/ for Div");
       System.out.println("% for Mod");
       System.out.println("e for Exit");
       
       System.out.println("Select option : ");
       char code = sc.next().charAt(0);

       switch(code){
            case '+' : System.out.println("Add : "+(num1+num2));
                     break;
            case '-' : System.out.println("Sub : "+(num1-num2));
                     break;
            case '*' : System.out.println("Mul : "+(num1*num2));
                     break;
            case '/' : System.out.println("Div : "+(num1/num2));
                     break;
            case '%' : System.out.println("Mod : "+(num1%num2));
                     break;
            case 'e' : System.out.println("Visit Again");
                     break;
            default : System.out.println("Invalid code");
                     break;
       } 
        
    }
}

