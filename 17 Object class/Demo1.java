// example showing the concept of Object class method
// toString() 
class Student{
    int sid;
    String name;
    Student(int sid,String name){
        this.sid=sid;
        this.name=name;
    }
    @Override 
    public String toString(){
        return "{ "+sid+" , "+name+" }";
    }
    @Override 
    public int hashCode(){
        return sid;
    }
}
class Demo1{
    public static void main(String args[]){
        Student s1 = new Student(10101,"Peter Parker");
        Student s2 = new Student(10102,"Mathew Math");
        Student s3 = new Student(10103,"Andrew Anderson");
        System.out.println("Result : "+s1+" haschCode : "+s1.hashCode());
        System.out.println("Result : "+s2+" haschCode : "+s2.hashCode());
        System.out.println("Result : "+s3+" haschCode : "+s3.hashCode());
    }
}