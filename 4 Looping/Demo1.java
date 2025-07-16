// example showing the concept of for loop 

class Demo1{
    public static void main(String args[]){
        /*
        for(int i=1; i<=1000 ;i++)
            System.out.println("statement "+i);
        */
       /*
        int i;
        for(i=1; i<=5 ;i++); 
        System.out.println("statement "+i);
       */
        int i;
        for(i=1; ;i=i+1000000)  
            System.out.println("statement "+i);
      

    }
}