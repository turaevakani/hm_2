public class Taxi extends PublicTransport{
    private String taxiClasses;

    public Taxi(String name, String brand, String taxiClasses) {
        super(name, brand);
        this.taxiClasses = taxiClasses;
    }

    @Override
    public void print() {
        System.out.println("name: " + getName() +
                "\nbrand: " + getBrand() +
                "\ntaxi car classes: " + taxiClasses);

    }
}
