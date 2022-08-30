package example1;

public class Smallbox extends Box {
    private int lenght;
    private int width;

    public Smallbox(int lenght, int width) {
        super(lenght, width);
        this.lenght = lenght;
        this.width = width;
    }

    public void displayMethods() {
        System.out.println("This is child SmallBox class ");
    }

    public void getArea() {
        double area = lenght * width;

        System.out.println(String.format("The SmallBox are is %s ", area));
    }
}
