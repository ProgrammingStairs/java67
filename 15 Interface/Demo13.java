// program showing the concept of interface
interface Showable{
    default void show(){}
}
interface Drawable{
    default void show(){}
}
class Demo13 implements Showable,Drawable{
    @Override
    public void show(){
        System.out.println("show method called of Demo13");
    }
    public static void main(String args[]){
        Showable obj = new Demo13();
        obj.show();
    }
}
