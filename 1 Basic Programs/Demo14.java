// EXAMPLE TO FIND OUT AREA OF CIRCLE

class Demo14{
    public static void main(String args[]){
       double r = 2.34, PI = 3.14;
    //    double area = PI * r * r; 
       double area = PI * Math.pow(r,2); 

       System.out.println("Area of circle : "+area);
       System.out.printf("Area of circle : %.2f\n",area);
    }
}

