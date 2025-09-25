// example showing the concept of Constructor overloading

class Demo{
    Demo(int a,double b){
        double res = a>b ? a : b;
        System.out.println("Greater Number : "+res);
    }
    Demo(double a,int b){
        double res = a>b ? a : b;
        System.out.println("Greater Number : "+res);
    }
}
class Demo8{
    public static void main(String args[]){
      new Demo(45,5.6);
      new Demo(4.5,3);
    }
}


/*
// error case

int greater(int a,int b){}
double greater(int a,int b){}

greater(23,34);
greater(34,32);
*/