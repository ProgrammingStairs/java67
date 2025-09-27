// program showing the concept of Interface 
interface Showable{
    int age=18; // public static final
    void getAge(); // public abstract
}
class Demo9{
    public static void main(String args[]){
        /*
        Showable obj  = new Showable(){
           @Override
            public void getAge(){
                System.out.println("Age : "+age);
            }
        };
        obj.getAge();
        */
        new Showable(){
           @Override
            public void getAge(){
                System.out.println("Age : "+age);
            }
        }.getAge();
        
    }
}
