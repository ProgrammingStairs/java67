// example showing the concept of Nested class
// non-static nested class | member class

class Enclosing{ // Enclosing class    
    void show(){
        NonStaticNestedClass obj = new NonStaticNestedClass();
        obj.display();
    }
    class NonStaticNestedClass{ // non-static nested class | member class
        void display(){
            System.out.println("display method called");
        }
    }
}
class Demo5{
    public static void main(String args[]){
        Enclosing obj = new Enclosing();
        obj.show();
    }
}