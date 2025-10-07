// example showing the concept of creating custom exception

import java.util.Scanner;
class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String message){
        super(message);
    }
}
class Bank{
    int balance;
    Bank(int bal){
        this.balance=bal;
    }
    void withdraw() throws InsufficientBalanceException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter withdraw amount : ");
        int wamt = sc.nextInt();
        if(wamt>balance){
            throw new InsufficientBalanceException("Low Balance");
        }else{
            System.out.println("Balance : "+balance);
            System.out.println("Withdrawal amount : "+wamt);
            this.balance -= wamt;
            System.out.println("Remaining Balance : "+balance);
        }
    }
}
class Demo13{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter balance : ");
        int balance = sc.nextInt();

        Bank bank = new Bank(balance);
        try{
            bank.withdraw();
        }catch(InsufficientBalanceException e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}
