// this can also be passed as an argument in method call
class Demo6{
    void show(Demo6 obj){
        System.out.println("show method called");
        System.out.println("default string representation of object : "+obj);
    }
    void display(){
        System.out.println("display method called");
        show(this); // this.show();
    }
    public static void main(String args[]){
        Demo6 obj = new Demo6();
        obj.display();
    }
}

