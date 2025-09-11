// example showing the concept of jagged array
class Demo4{
    public static void main(String args[]){
    int arr[][] = new int[5][];

    arr[0] = new int[]{ 1 ,  2 ,  3 };
    arr[1] = new int[]{ 3 ,  4 ,  6 ,  8  , 9 ,  7};
    arr[2] = new int[]{ 7 ,  8 ,  9 ,  8  , 7};
    arr[3] = new int[]{ 2 ,  4 };  
    arr[4] = new int[]{ 8 ,  6 ,  7  , 6};
            
    System.out.println("Array elements are : ");
    for(int ar[] : arr){
        for(int element : ar)
            System.out.print(element+"\t");
        System.out.println();
    }
    }
}

/*
2d array ---------special type of 2d array ----- Jagged Array

int arr[][] = new int[5][];
arr.length = no. of rows = 5

arr[0] = new int[]{ 1 ,  2 ,  3 }
arr[1] = new int[]{ 3 ,  4 ,  6 ,  8  , 9 ,  7}
arr[2] = new int[]{ 7 ,  8 ,  9 ,  8  , 7}
arr[3] = new int[]{ 2 ,  4 }  
arr[4] = new int[]{ 8 ,  6 ,  7  , 6}
*/