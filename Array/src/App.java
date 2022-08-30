public class App {
    public static void main(String[] args) throws Exception {

        // declares an Array of integers.
        Students[] arr;

        // allocating memory for 5 objects of type Student.
        arr = new Students[5];

        arr[0] = new Students(1, "Apple");
        arr[1] = new Students(2, "Orange");
        arr[2] = new Students(3, "Mango");
        arr[3] = new Students(4, "Banana");
        arr[4] = new Students(5, "Papaya");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Roll :" + " " + arr[i].roll + " " + arr[i].name);

        }

        int arra[][] = { { 1, 2, 2 }, { 1, 6, 3 }, { 1, 5, 2 } };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(arra[i][j] + " ");
            System.out.println();

        }
    }
}
