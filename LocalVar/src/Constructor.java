public class Constructor {
    // Instance Variable
    int roll;
    double marks;

    // Constructor
    public Constructor(int roll, double marks) {
        this.roll = roll;
        this.marks = marks;

    }

    public static void main(String[] args) {
        Constructor obj1 = new Constructor(12, 97.0);
        Constructor obj2 = new Constructor(18, 99.3);
        obj1.show();
        obj2.show();

    }

    public void show() {
        System.out.println("\sroll:\s" + roll + "\smarks:\s" + marks);

    }

}
