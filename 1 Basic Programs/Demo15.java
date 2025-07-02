// EXAMPLE TO FIND OUT compound interest

class Demo15{
    public static void main(String args[]){
       int p = 1000, t = 5; 
       double r = 2.34, amt , ci;
       amt = p*Math.pow(1+r/100,t); 
       ci = amt-p; 
       System.out.println("Amount : "+amt);
       System.out.println("Compound Interest : "+ci);
    }
}

