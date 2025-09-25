// program showing the concept of Abstraction

import java.util.Scanner;
abstract class RBI{
    RBI(){
        System.out.println("#### Welcome to Bank ####");
    }
    abstract double rate();    
    double finalSum(int bal,double rate){
        return bal + bal * rate/100;
    }
}
class PNB extends RBI{
    double rate(){
        return 2.23;
    }
}
class BOI extends RBI{
    double rate(){
        return 1.87;
    }
}
class SBI extends RBI{
    double rate(){
        return 4.23;
    }
}

class Demo3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter balance : ");
        int bal = sc.nextInt();
        RBI obj;
            obj = new PNB();
            System.out.println("Rate by PNB : "+obj.rate());
            System.out.println("Final sum by PNB : "+obj.finalSum(bal,obj.rate()));

            obj = new BOI();
            System.out.println("Rate by BOI : "+obj.rate());
            System.out.println("Final sum by BOI : "+obj.finalSum(bal,obj.rate()));

            obj = new SBI(); 
            System.out.println("Rate by SBI : "+obj.rate());
            System.out.println("Final sum by SBI : "+obj.finalSum(bal,obj.rate()));
    }
}