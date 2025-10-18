// example showing the concept of file handling in java

import java.io.*;
class Demo2{
    public static void main(String args[]){
        File file = new File("D:\\desktop\\CodingThinker\\java67\\22 file handling\\myFolder\\myfile1.txt");
        try{
            if(!file.exists()){
                file.createNewFile();
                System.out.println("File created successfully");
            }else{
                System.out.println("File already exist");
            }
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}