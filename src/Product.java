public class Product {
    Long id;
    String name;
    int amount;
    double price;


    public Product() {
    }

    public Product(Long id, String name, int amount, double price)
    {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    void printInfo() {
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Amount: "+amount);
        System.out.println("Price: "+price+" OMR");
    }

    double getTotalPrice(){
        return amount * price;
    }

    void addAmount(int value){
        amount +=value;
    }

    void reduceAmount(int value){
        if (amount >= value) {
            amount -= value;
        } else {
            System.out.println("Not enough amount");
        }
    }
}