// example to print all the armstrong numbers between two entered numbers

import java.util.Scanner;
class Demo6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial and final number : ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = n ; i<=m ; i++){
            int count=0,rem;
            double sum=0;
            int temp = i;
            int temp1= i;
            int temp2 = i;

            while(temp>0){
                count++;
                temp = temp/10;
            }
            while(temp1>0){
                rem = temp1 % 10;
                sum = sum + Math.pow(rem,count);
                temp1 = temp1/10;
            }
            if(temp2==sum)
                System.out.print(temp2+"\t");
        } 
    }
}

