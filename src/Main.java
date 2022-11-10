public class Main {

    public static Printable createObjects(String className){
        return switch (className){
            case "Bus"-> new Bus("Bus", "Ankal", 11);
            case "Plane"-> new Plane("Plane", "Boeing", "USA");
            case "Taxi" -> new Taxi("Taxi", "BMW", "Comfort");
            default -> null;
        };
    }
    public static void main(String[] args) {
        createObjects("Bus").print();
        System.out.println("----------------------");
        createObjects("Plane").print();
        System.out.println("----------------------");
        createObjects("Taxi").print();

    }
}