// example showing the concept of array of object

class Product{
    int pid;
    String name;
    double price;

    Product(int pid, String name, double price){
        this.pid=pid;
        this.name=name;
        this.price=price;
    }
    void display(){
        System.out.println("\nProduct Id : "+pid);
        System.out.println("Product Price : "+price);
        System.out.println("Product Name : "+name);
    }
}
class Demo14{
    public static void main(String args[]){
        
        Product pobj[] = new Product[2]; // reference array
        System.out.println("pobj[0] : "+pobj[0]);
        System.out.println("pobj[1] : "+pobj[1]);

        pobj[0] = new Product(101,"Soap",567.78);
        pobj[1] = new Product(102,"Fairness Cream",200.543);

       // Product pobj[] = new Product[2]; // array of object

        System.out.println("pobj[0] : "+pobj[0]);
        System.out.println("pobj[1] : "+pobj[1]);

        pobj[0].display();
        pobj[1].display();
    }
}
