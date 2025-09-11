// example showing the concept of initializer block
class Demo14{
    int a; // instance variable
    // initializer block
    {
        a = 200;
    }
    Demo14(){
        // initializer block
        a = 300;
    }
    public static void main(String args[]){
        Demo14 obj = new Demo14();
        System.out.println("value of a : "+obj.a);
    }
}

/*

                initializer block 
        _______________|_________________
        |                                |
 static initializer block    instance initializer block
   (static block)                   

*/                         