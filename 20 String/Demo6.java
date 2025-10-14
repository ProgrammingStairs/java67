// exampe showing the concept of string

import java.util.Scanner;
class Demo6{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter string : ");
       String str = sc.nextLine();

       String words[] = str.split(" ");
       for(int i=0;i<words.length/2;i++){
            String temp = words[i];
            words[i] = words[words.length-1-i];
            words[words.length-1-i] = temp;
       } 
        System.out.println("Reverse string : ");

       for(String word : words) 
        System.out.print(word+"\t");
    }
}