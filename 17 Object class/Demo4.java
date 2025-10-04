// example showing the concept of Object class method
// finalize()
@Deprecated
class Demo4{
    @Override 
    protected void finalize(){
        System.out.println("finalize method called");
    }
    public static void main(String args[]){
        Demo4 obj = new Demo4();
        System.out.println("obj : "+obj.hashCode());

        obj = null;
        System.gc();
    }
}