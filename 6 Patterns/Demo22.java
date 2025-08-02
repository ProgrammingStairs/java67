class Demo22{
    public static void main(String args[]){
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(i==4 || j==4 || i==1 && j!=2 && j!=3 || j==1 && i!=5 && i!=6 || i==7 && j!=5 && j!=6 || j==7 && i!=2 && i!=3)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}