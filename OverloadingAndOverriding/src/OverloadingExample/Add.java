package OverloadingExample;

public class Add {
    public int add(int x, int y) {
        return x + y;
    }

    public int add(int x, int y, int z) {
        return x + y + z;
    }

    public double add(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        Add add = new Add();
        System.out.println(add.add(20, 34));
        System.out.println(add.add(20, 39, 20));
        System.out.println(add.add(23.22, 23.09));
    }
}
