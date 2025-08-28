// example showing the concept of Varargs(variable arguments)
class Demo9{
    void test(String name,int...var){
        System.out.println("length : "+(var.length+1));
        System.out.print(name+"\t");
        for(int element : var){
            System.out.print("\t"+element);
        }
        System.out.println();
    }
    public static void main(String args[]){
        Demo9 obj = new Demo9();
        obj.test("noname",1,2);
        obj.test("noname",1,2,3);
        obj.test("noname",1,2,3,4);
        obj.test("noname",1,2,3,4,5);
        obj.test("noname",new int[]{1,2,3,4,5});
    }
}

