public class Book {
    String title;
    String author;
    int pages;
    double price;

    public Book() {
    }

    public Book(String title, String author, int pages, double price){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }

    void printInfo() {
        System.out.println("title by "+author+", pages: "+pages+", price: "+price+" OMR");
    }

    boolean isExpensive(){
        if (price > 10.0){
            return true;
        }
        return false;
    }

    void applyDiscount(double percent) {
        price = price - (price * (percent / 100));
    }

    double getPricePerPage() {
        return (price / pages);
    }
}
