// example showing the concept of Nested class
// static nested class 

class Demo1{ // Enclosing class
    
    static int rno = 101;
    static String name = "Andrew Anderson";

    static class StaticNestedClass{ // static nested class
        void display(){
            System.out.println("Roll Number : "+rno);
            System.out.println("Name : "+name);
        }
    }
    public static void main(String args[]){
        StaticNestedClass snc = new StaticNestedClass();
        snc.display();
    }
}