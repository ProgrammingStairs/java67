// Program showing the concept of increment | decrement operator
class Demo8{
    public static void main(String args[]){
        int a = 10 , res;
        //res = a++ + ++a + a-- + --a - --a + a++;
        //     10 + 12 + 12 + 10 - 9 + 9 

        res = --a - --a - a - a++ - a++ - a + a--;
        //    9 - 8 - 8 - 8 - 9 - 10 + 10
        System.out.println("Result = "+res);    
    }
}
