// program showing the concept of Interface 
interface Showable{
    void show();
}
interface Drawable extends Showable{
    void draw();
}
class Demo5 implements Showable,Drawable{
    @Override
    public void show(){
        System.out.println("show method called");
    }
    @Override
    public void draw(){
        System.out.println("draw method called");
    }
    public static void main(String args[]){
        Drawable obj = new Demo5();
        obj.show();
        obj.draw();
    }
}