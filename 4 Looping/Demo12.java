// example to check whether entered number is armstrong or not
import java.util.Scanner;
class Demo12{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int count=0;
        int temp = num,rem,temp1=num;
        double sum=0;
        while(num>0){
            num = num/10;
            count++;
        }
        while(temp>0){
            rem = temp%10;
            sum = sum + Math.pow(rem,count);
            temp = temp/10;
        }
        if(temp1==sum)
            System.out.println("Number is Armstrong");
        else
            System.out.println("Number is not Armstrong");
    }
}