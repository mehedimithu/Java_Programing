package Example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        // Non-Generic ArrayList
        List arrayList1 = new ArrayList();

        arrayList1.add("String1 ");
        arrayList1.add("String2 ");
        arrayList1.add("3");

        arrayList1.remove(1);
        System.out.println(arrayList1);

        // Non-Generic ArrayList
        ArrayList arrayList2 = new ArrayList();

        arrayList2.add("A");
        arrayList2.add(3);
        arrayList2.add(true);

        System.out.println(arrayList2);

        // Generic ArrayList
        List<String> arrayList3 = new ArrayList<String>();

        arrayList3.add("A");
        arrayList3.add("B");
        arrayList3.add("C");

        System.out.println(arrayList3);

        // Generic ArrayList
        ArrayList<Integer> arrayList4 = new ArrayList<Integer>();

        arrayList4.add(2);
        arrayList4.add(4);
        arrayList4.add(10);
        Collections.sort(arrayList4);
        
        System.out.println(arrayList4);

    }
}
