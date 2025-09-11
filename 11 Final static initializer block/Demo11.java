// example showing the concept of static block
import java.util.Scanner;
class Student{
    int rno;
    String name;
    static String cname;

    Student(int rno,String name){
        this.rno=rno;
        this.name=name;
    }
    void display(){
        System.out.println(rno+" "+name+" "+cname);
    }
    static void getCollegeName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter college name : ");
        cname = sc.nextLine();
    }
}
class Demo11{
    public static void main(String args[]){
        Student.getCollegeName();

        Student s1 = new Student(101,"Andrew Anderson");
        Student s2 = new Student(102,"Peter Parker");

        s1.display();
        s2.display();
    }
}