// example showing the concept of final keyword 

class Demo5{
    final int a;
    Demo5(){
        a = 200;
    }
    public static void main(String args[]){
        Demo5 obj = new Demo5();
        System.out.println("a : "+obj.a);
    }
}