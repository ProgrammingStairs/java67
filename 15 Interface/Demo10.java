// program showing the concept of anonymous class by abstract class 
abstract class Showable{
    int age=18; // public static final
    abstract void getAge(); // public abstract
}
class Demo10{
    public static void main(String args[]){
        new Showable(){
           @Override
            public void getAge(){
                System.out.println("Age : "+age);
            }
        }.getAge();
        
    }
}
