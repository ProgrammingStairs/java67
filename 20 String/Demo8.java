// exampe showing the concept of string

import java.util.StringJoiner;
class Demo8
{
    public static void main(String args[]){
        StringJoiner sj = new StringJoiner("-");
        sj.add("14");
        sj.add("10");
        sj.add("2025");
        System.out.println("Today's Date : "+sj);

        String s1 = String.join("-","14","10","2025");
        System.out.println("Today's Date : "+s1);
    }
}