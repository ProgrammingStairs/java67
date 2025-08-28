// example showing the concept of command line argument
class Demo11{
    public static void main(String args[]){
        System.out.println("No. of arguments : "+args.length);
        int sum=0;
        for(String element : args){
            sum = sum + Integer.parseInt(element);
        }
        System.out.println("Sum : "+sum);
    }
}


