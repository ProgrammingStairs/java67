// example showing the concept of clone method of object class | deep cloning

class Course implements Cloneable{
    String courseName,authorName;
    Course(String courseName,String authorName){
        this.courseName = courseName;
        this.authorName = authorName;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
class Student implements Cloneable{
    int sid;
    String name;
    Course course;
    Student(int sid, String name,Course course){
        this.sid=sid;
        this.name=name;
        this.course=course;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        Student stud = (Student)super.clone();
        stud.course = (Course)course.clone();
        return stud;
    }
}
class Demo15{
    public static void main(String args[]){
        try{
            Course course = new Course("Java Programming","James Gosling");
            Student s1 = new Student(101,"Peter Parker",course);
            Student s2 = (Student)s1.clone(); // downcasting

            s2.course.courseName = "Sanskrit";

            System.out.println("First Student Details : ");
            System.out.println("Name : "+s1.name);
            System.out.println("Roll Number : "+s1.sid);
            System.out.println("CourseName : "+s1.course.courseName);
            System.out.println("AuthorName : "+s1.course.authorName);

            System.out.println("\nSecond Student Details : ");
            System.out.println("Name : "+s2.name);
            System.out.println("Roll Number : "+s2.sid);
            System.out.println("CourseName : "+s2.course.courseName);
            System.out.println("AuthorName : "+s2.course.authorName);
        }catch(CloneNotSupportedException e){
            System.out.println("Exception : "+e);
        }
    }
}