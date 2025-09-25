// program showing the concept of Abstraction

abstract class RBI{
    abstract double rate();    
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

class Demo2{
    public static void main(String args[]){
        RBI obj;
            obj = new PNB();
            System.out.println("Rate by PNB : "+obj.rate());
            obj = new BOI();
            System.out.println("Rate by BOI : "+obj.rate());
            obj = new SBI(); 
            System.out.println("Rate by SBI : "+obj.rate());
    }
}