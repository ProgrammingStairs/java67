// example showing the concept of singleton class 
// Lazy initialization
class Singleton{
    static private Singleton instance;
    private Singleton(){}
    static Singleton getInstance(){
        if(instance==null)
            instance = new Singleton();
        return instance;        
    }    
    int a=100;
    static void display(){
        System.out.println("instance : "+instance);
    }
}
class Demo3{
    public static void main(String args[]){
            Singleton.display();
        Singleton instance = Singleton.getInstance();
        System.out.println("value of a : "+instance.a);

        instance.a += 200;
        System.out.println("value of a : "+instance.a);

        Singleton instanceNew = Singleton.getInstance();
        System.out.println("value of a : "+instanceNew.a);
    }
}