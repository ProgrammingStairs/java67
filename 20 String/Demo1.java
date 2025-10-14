// exampe showing the concept of string

class Demo1{
    public static void main(String args[]){
        // string literal
        String s1 = "Andrew Anderson";
        System.out.println("s1 : "+s1);

        // By New keyword 
        String s2 = new String("Peter Parker");
        System.out.println("s2 : "+s2);
        
        char ch[] = {'H','e','l','l','o'};
        String s3 = new String(ch);
        System.out.println("s3 : "+s3);
        
        byte bt[] = {65,66,67,68,69};
        String s4 = new String(bt);
        System.out.println("s4 : "+s4);

    }
}