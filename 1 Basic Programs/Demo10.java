// Program showing the concept of ternary operator | conditional operator
class Demo10{
    public static void main(String args[]){
        int a = 10, b = 20, c = 2;

        String res = a > b ? ( a > c ? a+" is greater" : c+" is greater" ) : ( b > c ? b+" is greater" : c+" is greater" );
        System.out.println(res);
    }
}
