// exampe showing the concept of string

import java.util.Scanner;
class Demo5{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter string : ");
       String str = sc.nextLine();

       char ch[] = str.toCharArray();
       for(int i=0;i<ch.length/2;i++){
            char temp = ch[i];
            ch[i] = ch[ch.length-1-i];
            ch[ch.length-1-i] = temp;
       } 

       String s1 = new String(ch);
       System.out.println("Reverse string : \n"+s1);
    }
}