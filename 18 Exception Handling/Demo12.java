// example showing the concept of creating custom exception by Checked exception
/*
class MyException extends Exception{
    MyException(String message){
        super(message);
    }
    void display(){
        try{
            throw new MyException("Throwing Custom Exception");
        }catch(MyException e){
            System.out.println("Exception : "+e);
        }
    }
}
class Demo12{
    public static void main(String args[]){
        MyException obj = new MyException("");
            obj.display();
    }
}
*/

class MyException extends Exception{
    MyException(String message){
        super(message);
    }
    void display() throws MyException{
        throw new MyException("Throwing Custom Exception");
    }
}
class Demo12{
    public static void main(String args[]) throws MyException{
        MyException obj = new MyException("");
            obj.display();
    }
}