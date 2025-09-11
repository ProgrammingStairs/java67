// example showing the concept of static block

class Demo{
    static String address = "Indore";
}
class Demo9{
    static String name = "Andrew Anderson";
    public static void main(String args[]){
        System.out.println("Name : "+Demo9.name);
        System.out.println("Name : "+name);
         System.out.println("Address : "+Demo.address);
    }
}