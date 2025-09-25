// example showing the concept of inheritance

class Parent {
    void display(){
        System.out.println("display of parent called");
    }
}
class Child extends Parent {
    void show(){
        System.out.println("show of child called");
    }
}
class Demo1{
    public static void main(String args[]){
        Child cobj = new Child();
        cobj.show();
        cobj.display();
    }
}