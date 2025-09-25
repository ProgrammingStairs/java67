// example showing the concept of method overriding

class Parent{
    void display(){
        System.out.println("display of parent called");
    }
}
class Child extends Parent{
    @Override
    void display(){
        System.out.println("display of child called");
    }
}
class Demo13{
    public static void main(String args[]){
        Parent obj = new Child(); // upcasting
        obj.display();
    }
}
