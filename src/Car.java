public class Car {
    String brand;
    String model;
    int year;
    double rentalPricePerDay;

    public Car() {
    }

    public Car(String brand, String model, int year, double rentalPricePerDay) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    void printInfo() {
        System.out.println(brand+" "+model+", "+"year: "+year+", "+"rent: "+rentalPricePerDay+" OMR/day");
    }

    double getRentalCost(int days) {
        return rentalPricePerDay * days;
    }

    boolean isOld(int currentYear) {
        if((currentYear - year) > 10){
            return true;
        }
        return false;
    }

    void applyDiscount(double percent) {
        rentalPricePerDay = rentalPricePerDay - (rentalPricePerDay * (percent / 100));
    }
}
