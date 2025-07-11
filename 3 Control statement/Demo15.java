// program switch control statement
class Demo15{
    public static void main(String args[]){
        int i=1,num=10;
        switch(i++){
            case -4 : num++;
            case 0 : num--;
                        break;
            case -2 : num--;
            case 1 : --num;  // 9
            case 5 : --num;  // 8
            default : System.out.println("num : "+(num++)); // 8
                        break;
        }        
    }
}

