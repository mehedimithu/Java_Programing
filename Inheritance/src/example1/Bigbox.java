package example1;

public class Bigbox extends Box {

    private int lenght;
    private int width;
    private int height;

    public Bigbox(int lenght, int width, int height) {
        super(lenght, width);
        this.lenght = lenght;
        this.width = width;
        this.height = height;
    }

    public void displayMethods() {
        System.out.println("This is child BiglBox class ");
    }

    public void getArea() {
        double area = lenght * width * height;

        System.out.println(String.format("The BigBox are is %s ", area));
    }

}
