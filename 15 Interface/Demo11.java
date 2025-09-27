// program showing the concept of anonymous class by normal class 
class Showable{
    int age=18;
}
class Demo11{
    public static void main(String args[]){
        new Showable(){
            public void getAge(){
                System.out.println("Age : "+age);
            }
        }.getAge();
        
    }
}
