// example showing the concept of Nested class
// static nested class 
class EnclosingClass{ // Enclosing class
    
    static int rno = 101;
    static String name = "Andrew Anderson";

    static class StaticNestedClass{ // static nested class
        void display(){
            System.out.println("Roll Number : "+rno);
            System.out.println("Name : "+name);
        }
    }
}
class Demo2{
    public static void main(String args[]){
        EnclosingClass.StaticNestedClass snc = new EnclosingClass.StaticNestedClass();
        snc.display();
    }
}