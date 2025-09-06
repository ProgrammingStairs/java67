// example showing the concept of final keyword 

class Demo4{
    public static void main(String args[]){
        final int arr[]=new int[]{1,2,3,4,5};
        int arr1[] = {11,21,31,41,51};
        arr = arr1;
        System.out.println("Array elements are : ");
        for(int element : arr1){
            System.out.print(element+"\t");
        }
    }
}