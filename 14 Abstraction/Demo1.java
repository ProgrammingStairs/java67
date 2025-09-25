// program showing the concept of Abstraction

abstract class AbstractClass{
    abstract void display();    
}
class Demo1 extends AbstractClass{
    @Override
    void display(){
        System.out.println("display method called");
    }
    public static void main(String args[]){
        AbstractClass ref = new Demo1(); // upcasting
        ref.display();
    }
}