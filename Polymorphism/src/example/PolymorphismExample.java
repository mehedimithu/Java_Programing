package example;

public class PolymorphismExample {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ford", "F150", 2012);
        v1.start();
        v1.stop();

        System.out.println("____________________");
        Tesla v2 = new Tesla("Tesla", "F27", 2020);
        v2.start();
        v2.stop();

        System.out.println("____________________");
        Motorbike v3 = new Motorbike("Yamaha", "FZ", 2021);
        v3.start();
        v3.stop();

    }

}
