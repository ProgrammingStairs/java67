// example showing the concept of exception handling

class Demo9{
    public static void main(String args[]){
        try{
            Class.forName("Demo8");
            System.out.println("Class Found");
        }catch(ClassNotFoundException e){
            System.out.println("Class Not Found");
            System.out.println("Exception : "+e.getMessage());
        }
    }
}