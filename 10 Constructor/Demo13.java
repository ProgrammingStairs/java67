// example

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
class Demo13{
    public static void main(String args[]){
        Product p1 = new Product(101,"Soap",567.78);
        Product p2 = new Product(102,"Fairness Cream",200.543);
        p1.display();
        p2.display();
    }
}
