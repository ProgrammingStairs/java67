// program switch control statement
import java.util.Scanner;
class Demo20{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
                
       System.out.println("Select from Below Options : ");
       System.out.println("R/r for Area of Rectangle");
       System.out.println("C/c for Area of Circle");
       System.out.println("E/e for Exit");
       
       System.out.println("Select option : ");
       char code = sc.next().charAt(0);

       switch(code){
            case 'r' : 
            case 'R' : 
                    System.out.println("Enter length and breadth : ");
                    int l = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("Area of rectangle : "+(l*b));
                        break;
            case 'c' : 
            case 'C' : 
                    System.out.println("Enter Radius : ");
                    double r = sc.nextDouble();
                    System.out.println("Area of circle : "+(3.14*r*r));
                     break;
            case 'E' : 
            case 'e' : System.out.println("Visit Again");
                     break;
            default : System.out.println("Invalid code");
                     break;
       } 
    }
}

