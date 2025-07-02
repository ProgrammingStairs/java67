// program showing the concept of Bitwise operator

class Demo13{
    public static void main(String args[]){
       int a = 9, b= 10;
       System.out.println("Bitwise AND : "+(a&b));
       System.out.println("Bitwise OR : "+(a|b));
       System.out.println("Bitwise XOR : "+(a^b));

    }
}

/*
....... 2^6 2^5 2^4 2^3 2^2 2^1 2^0
  128  64   32  16   8   4   2   1 
------------------------------------
                     1   0   0   1 = 9
                     1   0   1   1 = 11 
                     1   0   1   0 = 10

        Bitwise And (&) 

        1 0 0 1 = 9
     &  1 0 1 0 = 10
        ---------
        1 0 0 0 = 8
*/