// this can also be passed as an argument in constructor call
class Demo{
    Demo(Demo11 obj){
        obj.show();
    }
}
class Demo11{
    Demo11(){
        Demo obj = new Demo(this);
    }
    void show(){
        System.out.println("show method called");
    }
    public static void main(String args[]){
       Demo11 obj = new Demo11(); 
    }
}