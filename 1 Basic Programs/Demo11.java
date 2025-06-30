// Program showing the concept of logical operator
class Demo11{
    public static void main(String args[]){
        int a = 10, b = 20;

        String res1 = (a>5 && b>50) ? "statement 1" : "statement 2";
        String res2 = (a>5 || b>50) ? "statement 1" : "statement 2";
        System.out.println("Res1 : "+res1);
        System.out.println("Res2 : "+res2);

         System.out.println("Res3 : "+!true);
         System.out.println("Res3 : "+!!true);
         System.out.println("Res3 : "+!(5>2));
         
    }
}
