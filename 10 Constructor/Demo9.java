// example showing the concept of deep copy 

class Address{
    String city, state;
    Address(String city,String state){
        this.state=state;
        this.city=city;
    }
    Address(Address s1){
        this.state= s1.state;
        this.city = s1.city;
    }
}
class Student{
    int rno;
    String name;
    Address address;

    Student(int rno,String name,Address address){
        this.rno=rno;
        this.name=name;
        this.address=address;
    }
    Student(Student s1){
        rno = s1.rno;
        name= s1.name;
        address = new Address(s1.address);
    }
    void display(){
        System.out.println("\nRoll Number : "+rno);
        System.out.println("Name : "+name);
        System.out.println("Address : "+address.city+"\t"+address.state);
    }
}
class Demo9{
    public static void main(String args[]){
        Address address = new Address("MP","Indore");
        Student s1 = new Student(101,"Andrew Anderson",address);
        Student s2 = new Student(s1);

        s2.address.city = "Bhopal";
        s2.address.state = "Madhya Pradesh";
            
        s1.display();
        s2.display();
    }
}