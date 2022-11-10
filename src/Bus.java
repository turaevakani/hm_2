public class Bus extends PublicTransport{
    private int number;

    public Bus(String name, String brand, int number) {
        super(name, brand);
        this.number = number;
    }
    @Override
    public void print() {
        System.out.println("name: " + getName() +
                 "\nbrand: " + getBrand() +
                "\nnumber: " + number);

    }
}
