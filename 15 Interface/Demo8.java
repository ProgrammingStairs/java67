// program showing the concept of Interface 
interface Showable{
    int age=18; // public static final
    void getAge(); // public abstract
}
class GetAge implements Showable{
    @Override
    public void getAge(){
        System.out.println("Age : "+age);
    }
}
class Demo8{
    public static void main(String args[]){
        Showable obj  = new GetAge();
        obj.getAge();
    }
}
