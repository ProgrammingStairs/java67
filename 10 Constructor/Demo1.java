// example showing the concept of Constructor

class Demo1{
    Demo1(){
        System.out.println("constructor called");
    }
    public static void main(String args[]){
        new Demo1();
        new Demo1();
        new Demo1();
    }
}