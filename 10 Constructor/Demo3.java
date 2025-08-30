// example showing the concept of Constructor

class Demo3{
    int rno;
    double per;
    String name;
    Demo3(){
        rno = 100;
        name = "Peter Parker";
        per = 45.56;
        System.out.println("constructor called");
    }
    void display(){
        System.out.println("Roll Number : "+rno);
        System.out.println("Name : "+name);
        System.out.println("Percentage : "+per);
    }
    public static void main(String args[]){
        Demo3 obj = new Demo3();
        obj.display();
    }
}