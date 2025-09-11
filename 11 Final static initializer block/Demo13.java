// example showing the concept of initializer block
class Demo13{
    public static void main(String args[]){
        int a = 100;
        // normal block
        {
            int b = 200;
                System.out.println("a : "+a);
                System.out.println("b : "+b);
        }
        System.out.println("a : "+a);
    }
}

/*

                initializer block 
        _______________|_________________
        |                                |
 static initializer block    instance initializer block
   (static block)                   

*/                         