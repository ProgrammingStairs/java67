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
        
        String s1 = "Hello User How are you User";
        System.out.println("indexOf : "+s1.indexOf('e'));
        System.out.println("indexOf : "+s1.indexOf("User"));
        System.out.println("lastIndexOf : "+s1.lastIndexOf("User"));
        
        byte bt[] = s1.getBytes();
        for(byte b : bt){
            System.out.print(b+"\t");
        }

        String s2 = "Welcome ";
        String s3 = "Andrew";
        s2.concat(s3);
        System.out.println("\nconcat : "+s2);
        System.out.println("\nconcat : "+s2.concat(s3));

        String s4 = "               Hello             User               ";
        System.out.println("\ntrim : "+s4.trim());
        
    }
}

