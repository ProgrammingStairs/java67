// example showing the concept of singleton class 
// eager initialization
class Singleton{
    static final private Singleton instance = new Singleton();
    private Singleton(){}
    static Singleton getInstance(){
        return instance;        
    }    
    int a=100;
}
class Demo1{
    public static void main(String args[]){
        Singleton instance = Singleton.getInstance();
        System.out.println("value of a : "+instance.a);

        instance.a += 200;
        System.out.println("value of a : "+instance.a);

        Singleton instanceNew = Singleton.getInstance();
        System.out.println("value of a : "+instanceNew.a);
    }
}