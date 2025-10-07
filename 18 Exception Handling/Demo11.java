// example showing the concept of creating custom exception by Unchecked exception

/*
class MyException extends RuntimeException{
    MyException(String message){
        super(message);
    }
    void display(){
        throw new MyException("Throwing Custom Exception");
    }
}
class Demo11{
    public static void main(String args[]){
        MyException obj = new MyException("");
        obj.display();
    }
}
*/

// example showing the concept of creating custom exception by Checked exception

class MyException extends Exception{
    MyException(String message){
        super(message);
    }
    void display() throws MyException{
        throw new MyException("Throwing Custom Exception");
    }
}
class Demo11{
    public static void main(String args[]){
        MyException obj = new MyException("");
        try{
            obj.display();
        }catch(MyException e){
            System.out.println("Exception : "+e);
        }

    }
}