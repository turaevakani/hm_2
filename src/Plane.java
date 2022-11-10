public class Plane extends PublicTransport{
    private String route;

    public Plane(String name, String brand, String route) {
        super(name, brand);
        this.route = route;
    }

    @Override
    public void print() {
        System.out.println("name: " + getName() +
                "\nbrand: " + getBrand() +
                "\nroute: " + route);


    }
}
