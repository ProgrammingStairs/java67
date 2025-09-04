// example showing the concept of array of object

import java.util.Scanner;
class Product{
    int pid;
    String name;
    double price;

    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product Id : ");
        pid = sc.nextInt();
        System.out.println("Enter Product Price : ");
        price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter Product Name : ");
        name = sc.nextLine();
    }
    void display(){
        System.out.println("\nProduct Id : "+pid);
        System.out.println("Product Price : "+price);
        System.out.println("Product Name : "+name);
    }
}
class Demo15{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of product : ");
        int num = sc.nextInt();

        Product pobj[] = new Product[num]; // reference array
        
        for(int i=0;i<pobj.length;i++){
              pobj[i] = new Product();
            pobj[i].getData();
        }       
        for(Product p : pobj)
            p.display();
    }
}
