// example

class Demo9{
    private int num=100;
    void display(){
        System.out.println("value of num inside display : "+num);
    }
    public static void main(String args[]){
        Demo9 obj = new Demo9();
        System.out.println("value of num inside main : "+obj.num);
        obj.display();
    }
}