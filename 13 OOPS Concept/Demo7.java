// example showing the concept of method overloading

class Demo{
    void greater(int a,int b){
        int res = a>b ? a : b;
        System.out.println("Greater Number : "+res);
    }
    void greater(double a,double b){
        double res = a>b ? a : b;
        System.out.println("Greater Number : "+res);
    }
}
class Demo7{
    public static void main(String args[]){
      Demo obj = new Demo();
      obj.greater(45,56);
      obj.greater(45.56,6.7);
    }
}
