// program showing the concept of interface
interface Showable{
    default void show(){
        System.out.println("show method called");
        System.out.println("statement 1");
        System.out.println("statement 2");
        System.out.println("statement 3");
    }
    default void display(){
        System.out.println("display method called");
        System.out.println("statement 1");
        System.out.println("statement 2");
        System.out.println("statement 3");
    }
}
class Demo14 implements Showable{
    public static void main(String args[]){
        Showable obj = new Demo14();
        obj.show();
        obj.display();
    }
}
