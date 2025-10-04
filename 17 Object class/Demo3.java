// example showing the concept of Object class method
// getClass()
class Demo3{
    public static void main(String args[]){
//        Demo3 obj = new Demo3();
        Object obj = new String();
        Class c = obj.getClass();    
        System.out.println("class name : "+c.getName());
    }
}