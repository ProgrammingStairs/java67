// example showing the concept of Varargs(variable arguments)
class Demo8{
    void test(int...var){
        System.out.println("length : "+var.length);
        for(int element : var){
            System.out.print("\t"+element);
        }
        System.out.println();
    }
    public static void main(String args[]){
        Demo8 obj = new Demo8();
        obj.test(1,2);
        obj.test(1,2,3);
        obj.test(1,2,3,4);
        obj.test(1,2,3,4,5);
        obj.test(new int[]{1,2,3,4,5});
    }
}

