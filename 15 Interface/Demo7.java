// program showing the concept of Interface 
/*
interface Showable{
    int a=100; // public static final
}

class Demo7{
    public static void main(String args[]){
        System.out.println("value of a : "+Showable.a);
    }
}
*/

/*
interface Showable{
    int a=100; // public static final
}

class Demo7 implements Showable{
    public static void main(String args[]){
        System.out.println("value of a : "+a);
    }
}
*/
interface Showable{
    int a=100; // public static final
}
interface Movable{
    int a=200; // public static final
}

class Demo7{
    public static void main(String args[]){
        System.out.println("value of a : "+Showable.a);
        System.out.println("value of a : "+Movable.a);
    }
}
