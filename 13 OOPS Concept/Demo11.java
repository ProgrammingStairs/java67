// example showing the concept of method overriding

class RBI{
    double rate(){
        return 1.0;
    }
}
class PNB extends RBI{
    @Override
    double rate(){
        return 2.34;
    }
}
class BOI extends RBI{
    @Override
    double rate(){
        return 3.12;
    }
}
class SBI extends RBI{}

class Demo11{
    public static void main(String args[]){
        PNB pobj = new PNB();
        BOI bobj = new BOI();
        SBI sobj = new SBI();
        
        System.out.println("Rate by PNB : "+pobj.rate());
        System.out.println("Rate by BOI : "+bobj.rate());
        System.out.println("Rate by SBI : "+sobj.rate());

    }
}
