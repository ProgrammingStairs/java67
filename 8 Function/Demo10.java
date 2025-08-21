// example showing the concept of getter and setter method

class Demo{
    private int num;
    // setter method
    void setNum(int n){
        num = n;
    }
    // getter method
    int display(){
        return num;
    }
}
class Demo10{
    public static void main(String args[]){
        Demo obj = new Demo();
        obj.setNum(100);
        System.out.println("Num inside main : "+obj.display());
    }
}