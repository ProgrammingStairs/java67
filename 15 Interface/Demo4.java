// program showing the concept of Interface 
interface Showable{
    void show();
}
interface Drawable{
    void draw();
}
class Demo4 implements Showable,Drawable{
    @Override
    public void show(){
        System.out.println("show method called");
    }
    @Override
    public void draw(){
        System.out.println("draw method called");
    }
    public static void main(String args[]){
        Showable obj = new Demo4();
        obj.show();
        Drawable obj1 = new Demo4();
        obj1.draw();
    }
}