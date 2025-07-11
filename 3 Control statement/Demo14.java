// program switch control statement
class Demo14{
    public static void main(String args[]){
        switch(0){
            case 0 : System.out.println("statement 1");
                        break;
            case 1 : System.out.println("statement 2");
                        break;
            case 2 : System.out.println("statement 3");
                        break;
            default : System.out.println("Invalid");
                        break;
        }        
    }
}

/*
Switch control statement 
-------------------------
1. Switch control statement is mainly used for menu based programming
2. It works on the concept of cases
3. Duplicate cases not allowed 
4. Switch can deals with constant , variable and expression

5 Syntax : 
    switch(variable | constant | expression){
        case 1 : ....
                 break;
        case 'a' : .....
                 break;
        case '+' : .....
                 break;
        case "red" : ....
                 break;
        default : .......
                 break;      
    }

*/

