// this can also be returned from a function call
class Demo12{
     Demo12 display(){
        return this;
    }
    void show(){
        System.out.println("show method called");
    }
    public static void main(String args[]){
       Demo12 obj = new Demo12();
       
    //    Demo12 object = obj.display();
    //    object.show(); 

       obj.display().show(); 

    }
}