// example showing the concept of array 
// Binary search
import java.util.Scanner;
class Demo10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter array elements : ");
        for(i=0;i<size;i++){
            arr[i] = sc.nextInt();    
        }
        int search;
        System.out.println("Enter element to be search : ");
        search = sc.nextInt();
       int first = 0,last = size-1, middle = (first+last)/2;
      
     while(first<=last){
          if(arr[middle]<search)
            first = middle+1;
          else if(arr[middle]==search){
            System.out.println("Element found at indexing : "+(middle+1));
           break;
          }    
          else
            last = middle-1;
        middle=(first+last)/2;
       } 
       if(first>last)
            System.out.println("\nElement not found");
    }
}