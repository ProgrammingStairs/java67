// example showing the concept of exception handling

class Demo6{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        String str = "Hello User";

        try{
            System.out.println("array : "+arr[2]);
            System.out.println("string : "+str.charAt(20));
        }catch(ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}