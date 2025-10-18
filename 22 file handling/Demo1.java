// example showing the concept of file handling in java

import java.io.File;
class Demo1{
    public static void main(String args[]){
        File file = new File("D:\\desktop\\CodingThinker\\java67\\22 file handling\\myFolder");
        if(!file.exists()){
            file.mkdir();
            System.out.println("folder created successfully");
        }else{
            System.out.println("folder already exist");
        }
    }
}