import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> car = new ArrayList<String>();

        car.add("Volvo");
        car.add("Mazda");
        car.add("BMW");
        car.add("Ford");

        /*
         * for (int i = 0; i < car.size(); i++) {
         * System.out.println(car.get(i));
         * 
         * }
         */

        // Sort an ArrayList
        Collections.sort(car);
        
        // for-each loop
        for (String i : car) {
            System.out.println(i);
        }

    }
}
