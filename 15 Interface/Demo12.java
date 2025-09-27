// program showing the concept of interface
interface Showable{
    default void show(){
        System.out.println("show method called");
    }
    static void display(){
        System.out.println("display method called");
    }
}
class Demo12 implements Showable{
    public static void main(String args[]){
        Showable obj = new Demo12();
        obj.show();
        Showable.display();
    }
}
