// example showing the concept of static block

class Demo{
    static{
        System.out.println("statement 1");
    }
}
class Demo8{
    public static void main(String args[]){
        System.out.println("statement 3");
        new Demo();
    }
    static{
        System.out.println("statement 2");
    }
}