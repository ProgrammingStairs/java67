// program showing the concept of Abstraction

abstract class Series{
    abstract void series(int n,int m);    
}
class EvenSeries extends Series{
    void series(int n,int m){
        System.out.println("\nEven number series : ");
        for(int i=n;i<=m;i++){
            if(i%2==0)
                System.out.print(i+" ");
        }
    }
}
class OddSeries extends Series{
    void series(int n,int m){
        System.out.println("\nOdd number series : ");
        for(int i=n;i<=m;i++){
            if(i%2!=0)
                System.out.print(i+" ");
        }
    }
}

class Demo4{
    public static void main(String args[]){
        Series obj;
            obj = new EvenSeries();
            obj.series(100,125);
            obj = new OddSeries();
            obj.series(100,125);
    }
}

