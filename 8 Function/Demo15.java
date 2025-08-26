// example
class Demo15{
    int num; // instance variable
    void changeValue(){
        num = 500;    
    }
    public static void main(String args[]){
        Demo15 obj = new Demo15();
        System.out.println("num : "+obj.num);
        obj.changeValue();   
        System.out.println("num : "+obj.num);
    }
}