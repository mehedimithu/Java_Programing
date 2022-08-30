package Example;

/**
 * Ford
 */
public class Ford implements Vehicle {
    public static void main(String[] args) {
        Ford ford = new Ford();
        ford.cruise();
        ford.start();
        ford.stop();
    }

    @Override
    public void start() {
        System.out.println("Starting");

    }

    @Override
    public void stop() {
        System.out.println("Stopping");

    }

    @Override
    public void cruise() {
        System.out.println(
                "cruising");

    }

}