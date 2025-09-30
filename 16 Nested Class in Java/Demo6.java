// example showing the concept of Nested class
// non-static nested class | local class

class Enclosing{ // Enclosing class    
    void show(){
        class NonStaticNestedClass{ // non-static nested class | local class
            void display(){
                System.out.println("display method called");
            }
        }
        NonStaticNestedClass obj = new NonStaticNestedClass();
        obj.display();
    }
}
class Demo6{
    public static void main(String args[]){
        Enclosing obj = new Enclosing();
        obj.show();
    }
}