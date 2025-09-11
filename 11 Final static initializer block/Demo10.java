// example showing the concept of static block

class Demo{
    static String address = "Indore";
    static void displayAddress(){
        System.out.println("Address : "+address);
    }
}
class Demo10{
    static String name = "Andrew Anderson";
    static void displayName(){
        System.out.println("Name : "+name);
    }
    public static void main(String args[]){
       Demo10.displayName();
       displayName();
       Demo.displayAddress();
    }
}