// example showing the concept of inheritance

class Parent {
    String name = "Andrew";
    void display(){
        System.out.println("display of parent called");
    }
    Parent(){
        System.out.println("Parent constructor called");
    }
}
class Child extends Parent {
    String name = "Mathew";
    void display(){
        System.out.println("display of child called");
    }
    void show(){
        System.out.println("Parent name : "+super.name);
        System.out.println("Child name : "+name);
            super.display();
            display();
    }
    Child(){
        super();
        System.out.println("Child constructor called");
    }
}
class Demo2{
    public static void main(String args[]){
        Child cobj = new Child();
        cobj.show();
    }
}


/*
    Super Keyword : 
        a. variable : deals with parent class instance variable
        b. method : deals with parent class method
        c. Constructor : deals with parent class constructor
*/
