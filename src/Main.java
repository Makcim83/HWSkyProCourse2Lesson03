public class Main {
    public static void main(String[] args) {
        Transport bike = new Transport("JAWA", "5", 1997, "Russia", "Red", 150);
        Car taxi = new Car("Nissan", "Logan", 2020, "Korea", "White", 180, 4);
        Bus bus = new Bus("Paz", "3205", 1999, "Russia", "Grey", 120, 25);

        print(bike);
        print(taxi);
        print(bus);


        System.out.println("Some tests:");
        bike.setBrand(null);
        bike.setModel("");
        bike.setColor("    ");
        bike.setMaximalSpeed(-10);
        taxi.setNumOfDoors(-1);
        bus.setNumOfPassengers(-1);
        print(bike);
        print(taxi);
        print(bus);
    }

    private static void print(Object o) {
        System.out.println(o);
    }
}
