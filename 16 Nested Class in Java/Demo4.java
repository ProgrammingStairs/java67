// example showing the concept of Nested class
// non-static nested class 

class Enclosing{ // Enclosing class    
    int rno = 101;
    static String name = "Andrew Anderson";
    private int pincode = 452010;

    class NonStaticNestedClass{ // non-static nested class
        void display(){
            System.out.println("Roll Number : "+rno);
            System.out.println("Name : "+name);
            System.out.println("Pincode : "+pincode);
        }
    }
}
class Demo4{
    public static void main(String args[]){
        Enclosing obj = new Enclosing();
        Enclosing.NonStaticNestedClass nsnc = obj.new NonStaticNestedClass();
        nsnc.display();
    }
}