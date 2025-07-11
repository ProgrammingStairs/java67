// program switch control statement
// output : duplicate case value error
class Demo16{
    public static void main(String args[]){
       char ch='a';
       switch(ch){
            case 'a' : System.out.println("character");
                        break;
            case 97 : System.out.println("ascii value");
                        break;
            default :   System.out.println("Invalid");
                        break;
       }        
    }
}

