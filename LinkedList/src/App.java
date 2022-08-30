import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        //Generic Linked list
        LinkedList<String> car = new LinkedList<String>();

        car.add("BMW");
        car.add(0, "Tesla");
        car.add(1, "Toyota");
        car.add(2, "Nissan");

        System.out.println(car);

        for (String i : car) {
            System.out.println(i);
        }

    }
}
