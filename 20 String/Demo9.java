// exampe showing the concept of string

import java.util.StringTokenizer;
class Demo9
{
    public static void main(String args[]){
        String str = "Hello User How are you ? ";
        StringTokenizer st = new StringTokenizer(str," ");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken()+"\t");
        }
    }
}