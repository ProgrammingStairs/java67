// example showing the concept of method overriding

class Parent{
    protected void display(){
        System.out.println("display of parent called");
    }
}
class Child extends Parent{
    @Override
    public void display(){
        System.out.println("display of child called");
    }
}
class Demo12{
    public static void main(String args[]){
        Child obj = new Child();
        obj.display();
    }
}
