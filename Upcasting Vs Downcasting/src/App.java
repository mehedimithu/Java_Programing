public class App {
    public static void main(String[] args) throws Exception {

        // Upcasting
        Parent parent = new Child();
        parent.name = "Upcasting";
        System.out.println(parent.name);
        parent.method();

        // Downcasting Explicitly
        Child child = (Child) parent;
        child.id = 10;
        System.out.println("");
        child.method();
        String name = child.name = "Downcasting";
        System.out.println(name);

    }
}
