// example showing the concept of method overriding

class Parent{
    void display(){
        System.out.println("display of parent called");
    }
    void draw(){
        System.out.println("draw of parent called");
    }
}
class Child extends Parent{
    @Override
    void display(){
        System.out.println("display of child called");
    }
    void show(){
        System.out.println("show of parent called");
    }
}
class Demo14{
    public static void main(String args[]){
        Parent obj = new Child(); // upcasting
        obj.display();
        obj.draw();

        Child cobj = (Child)obj;// downcasting
        cobj.show();
    }
}
