// example showing the concept of exception handling

class Demo7{
    static String s;
    public static void main(String args[]){
        try{
            System.out.println("Length : "+s.length());
        }catch(NullPointerException e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}