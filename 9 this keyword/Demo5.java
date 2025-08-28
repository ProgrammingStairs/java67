// this can be used to represent current class instance method
import java.util.Scanner;
class Demo5{
    int a,b; // instance variable
    void setData(int a,int b){
        this.a = a;
        this.b = b;
        add();     // this.add();
        this.sub();
        mul();     // this.mul();
        this.div();
        mod();      // this.mod();
    }
    void add(){
        System.out.println("Add : "+(a+b));
    }
    void sub(){
        System.out.println("Sub : "+(a-b));
    }
    void mul(){
        System.out.println("Mul : "+(a*b));
    }
    void div(){
        System.out.println("Div : "+(a/b));
    }
    void mod(){
        System.out.println("Mod : "+(a%b));
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Demo5 obj = new Demo5();
        obj.setData(a,b);
    }
}