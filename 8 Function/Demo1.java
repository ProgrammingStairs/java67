// example showing the concept of function

class Demo1{
    void display(){
        System.out.println("display method called");
    }
    public static void main(String args[]){
        /*
        new Demo1().display();
        new Demo1().display();
        new Demo1().display();
        new Demo1().display();
        new Demo1().display();
        */ 

       /*
       Demo1 obj = new Demo1();
       obj.display();
        obj.display();
         obj.display();
          obj.display();
           obj.display();
        */
       /*
       Demo1 obj1 = new Demo1();
       Demo1 obj2 = new Demo1();
        obj1.display();
        obj2.display();
        */

       /*
       Demo1 obj;
        obj = new Demo1();
        obj.display();
        
        obj = new Demo1();
        obj.display();
        */
       Demo1 obj1 = new Demo1(),obj2 = new Demo1();
        obj1.display();
        obj2.display();
    }
}