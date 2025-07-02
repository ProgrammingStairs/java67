/*
    Primitive Type Casting : 

    (double)5/2
    5.0 / 2 = 2.5

    5/(double)2
    5 / 2.0 = 2.5

    Conversion of one datatype into another datatype is known as primitive type casting , but make sure both datatypes are of primitive type.

    Primitive type casting can be categorized as : 
    a. Implicit type casting 
        Smaller datatype is going to be stored in bigger datatype.
        No Data loss will be there.
        Ex : int is going to be insert into double

    b. Explicit type casting
        Bigger datatype is going to be stored in smaller datatype.
        Here chances of data loss will be more.
        Ex : double is going to be insert into int
         
*/ 
class Demo16{
    public static void main(String args[]){
      int a = 100; // declaration + initialization
      double b ;  // declaration
      b = a; // implicit type casting
      System.out.println("value of a : "+a);
      System.out.println("value of b : "+b);

      double a1 = 100.456; // declaration + initialization
      int b1 ;  // declaration
      b1 = (int)a1; // explicit type casting 
      System.out.println("value of a1 : "+a1);
      System.out.println("value of b1 : "+b1);

    }
}

