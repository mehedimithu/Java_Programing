import java.util.ArrayList;
import java.util.Collections;

public class NumberList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(1);
        numbers.add(5);
        numbers.add(18);
        numbers.add(110);

        //Sort an ArrayList 
        Collections.sort(numbers);

        for (int i : numbers) {
            System.out.println(i);
        }

    }

}
