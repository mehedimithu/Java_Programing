package example1;

public class InheritanceExample {

    public static void main(String[] args) {
        // Box object
        Box box1 = new Box(12, 12);
        box1.displayMethods();

        // SmallBox object
        Smallbox box2 = new Smallbox(12, 10);
        box2.displayMethods();
        box2.getArea();

        // SmallBox object
        Bigbox box3 = new Bigbox(12, 10, 12);
        box3.displayMethods();
        box3.getArea();

    }
}
