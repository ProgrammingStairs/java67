// this can also be used to return class instance
class Demo7{
    void show(){
        System.out.println("show method called");
    }
    Demo7 display(){
        System.out.println("display method called");
        return this;
    }
    public static void main(String args[]){
        Demo7 obj = new Demo7();
        // Demo7 objAgain = obj.display();
        // objAgain.show();
        
        obj.display().show();
    }
}

