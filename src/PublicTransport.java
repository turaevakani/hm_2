public abstract  class PublicTransport implements Printable{
    private String name;
    private String brand;

    public PublicTransport(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }
}
