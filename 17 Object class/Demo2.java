// example showing the concept of Object class method
// equals() 
class Student{
    @Override 
    public boolean equals(Object o){
        if(this==o)
            return true;
        else
            return false;
    }
}
class Demo2{
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student();
        if(s1.equals(s2))
            System.out.println("points to same reference");
        else    
            System.out.println("points to different reference");        
    }
}