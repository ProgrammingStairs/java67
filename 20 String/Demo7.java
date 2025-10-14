// exampe showing the concept of string

import java.util.Scanner;
class Demo7{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter string : ");
       String str = sc.nextLine();

       String words[] = str.split(" ");
       for(int i=0;i<words.length;i++){
            char ch[] = words[i].toCharArray();
            for(int j=0;j<ch.length/2;j++){
                char temp = ch[j];
                ch[j] = ch[ch.length-1-j];
                ch[ch.length-1-j] = temp;
            } 
            words[i] = new String(ch);
        } 
        System.out.println("Reverse String : ");
        for(String word : words)
            System.out.print(word+"\t");
    }
}