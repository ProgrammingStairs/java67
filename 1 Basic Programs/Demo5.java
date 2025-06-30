// Program
class Demo5{
    public static void main(String args[]){
        int a = 0x12;
        System.out.println("value of a : "+a);

        int b = 0xa12;
        System.out.println("value of b : "+b);
    }
}
/*
int a = 0x12; // hexadecimal(0-15) number system 
0   1   2   3   4   5   6   7   8   9  A  B   C   D   E   F
                                       10 11  12  13  14  15   
        1x16^1 + 2x16^0
        1x16 + 2x1
        16 + 2
        18 
*/