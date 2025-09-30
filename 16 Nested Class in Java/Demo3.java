// example showing the concept of Nested class
// non-static nested class 

class Demo3{ // Enclosing class    
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
    public static void main(String args[]){
        Demo3 obj = new Demo3();
        NonStaticNestedClass nsnc = obj.new NonStaticNestedClass();
        nsnc.display();
    }
}