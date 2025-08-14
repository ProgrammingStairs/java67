// example showing the concept of array 
// Linear search
import java.util.Scanner;
class Demo9{
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

        int flag=0;
        // linear search logic
        for(i=0;i<size;i++){
            if(arr[i]==search){
                System.out.println("Element found at index : "+(i+1));
                flag=1;
            }
        }
        if(flag==0)
            System.out.println("\nElement not found");

    }
}