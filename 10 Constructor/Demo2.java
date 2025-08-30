// example showing the concept of Constructor

class Demo2{
    Demo2(){
        int rno = 100;
        String name = "Peter Parker";
        double per = 45.56;
        System.out.println("constructor called");
        System.out.println("Roll Number : "+rno);
        System.out.println("Name : "+name);
        System.out.println("Percentage : "+per);
    }
    public static void main(String args[]){
        Demo2 obj = new Demo2();
    }
}