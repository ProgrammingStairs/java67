// program showing the concept of Interface 
interface Showable{
    void show();
    void display();
}
class Demo2 implements Showable{
    @Override
    public void show(){
        System.out.println("show method called");
    }
    @Override
    public void display(){
        System.out.println("display method called");
    }
    public static void main(String args[]){
        Showable obj = new Demo2();
        obj.show();
        obj.display();
    }
}