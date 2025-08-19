// example showing the concept of function

class Demo{
    void display(){
        System.out.println("display method called");
        Demo2 obj = new Demo2();
        obj.show();
    }
}
class Demo2{
    void show(){
        System.out.println("show method called");
    }
    public static void main(String args[]){
        Demo obj = new Demo();
        obj.display();
    }
}