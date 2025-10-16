// exampe showing the concept of string

class Demo11
{
    public static void main(String args[]){
        //StringBuffer sb = new StringBuffer("Welcome ");
        StringBuilder sb = new StringBuilder("Welcome ");
        
        sb.append("Andrew Anderson");
        System.out.println("append : "+sb);

        sb.delete(8,15);
        System.out.println("delete : "+sb);

        sb.insert(8,"Peter ");
        System.out.println("insert : "+sb);

        sb.replace(8,13," Jackson");
        System.out.println("replace : "+sb);

        sb.reverse();
        System.out.println("reverse : "+sb);

    }
}

