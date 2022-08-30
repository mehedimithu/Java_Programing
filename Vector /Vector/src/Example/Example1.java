package Example;

import java.util.Vector;

public class Example1 {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add(23);
        vector.add("A");
        int size = vector.size();
        
        System.out.println("Size" + " " + size + " " + "Elements" + " " + vector);

        Vector vector2 = new Vector(2);

        vector2.add("String1");

        vector2.add("String2");

        vector2.add("String3");

        System.out.println(vector2);

    }

}
