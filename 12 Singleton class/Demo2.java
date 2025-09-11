// example showing the concept of singleton class 
// eager initialization
class Singleton{
    static final private Singleton instance = new Singleton();
    private Singleton(){}
    static Singleton getInstance(){
        return instance;        
    }    
    int a=100;
    static void display(){
        System.out.println("instance : "+instance);
    }
}
class Demo2{
    public static void main(String args[]){
            Singleton.display();
        // Singleton instance = Singleton.getInstance();
        // System.out.println("value of a : "+instance.a);

        // instance.a += 200;
        // System.out.println("value of a : "+instance.a);

        // Singleton instanceNew = Singleton.getInstance();
        // System.out.println("value of a : "+instanceNew.a);
    }
}