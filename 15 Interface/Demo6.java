// program showing the concept of Interface 
interface Showable{
    void show();
}
class Demo{
    void display(){
        System.out.println("display of Demo called");
    }
}
class Demo6 extends Demo implements Showable{
    @Override
    public void show(){
        System.out.println("show method called");
    }
    @Override
    public void display(){
        System.out.println("display method called");
    }
    public static void main(String args[]){
        Demo6 obj = new Demo6();
        obj.show();
        obj.display();
    }
}