// exampe showing the concept of string

class Demo10
{
    public static void main(String args[]){
        String str = "Hello User How are you ? ";
        System.out.println("Uppercase : "+str.toUpperCase());
        System.out.println("Lowercase : "+str.toLowerCase());
        System.out.println("Starts with : "+str.startsWith("Hello"));
        System.out.println("ends with : "+str.endsWith("Hello"));
        System.out.println("charAt(4) : "+str.charAt(4));
        System.out.println("length : "+str.length());
        System.out.println("substring : "+str.substring(2,10));
    }
}