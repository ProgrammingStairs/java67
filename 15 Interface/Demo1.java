// program showing the concept of Interface 

interface Showable{
    void show();
}
class Demo1 implements Showable{
    @Override
    public void show(){
        System.out.println("show method called");
    }
    public static void main(String args[]){
        Showable obj = new Demo1();
        obj.show();
    }
}