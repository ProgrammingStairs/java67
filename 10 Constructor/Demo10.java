// example showing the concept of constructor chaining
// this can be used to call current class constructor
class Student{
    int rno;
    String name;
    double per;
    Student(){
        this(101);
    }
    Student(int rno){
        this(rno,"Andrew Anderson");        
    }
    Student(int rno,String name){
        this(rno,name,78.90);
    }
    Student(int rno,String name,double per){
        this.rno=rno;
        this.per=per;
        this.name=name;
        display();
    }
    void display(){
        System.out.println("Roll Number : "+rno);
        System.out.println("Percentage : "+per);
        System.out.println("Name : "+name);
    }
}
class Demo10{
    public static void main(String args[]){
        new Student();
    }
}