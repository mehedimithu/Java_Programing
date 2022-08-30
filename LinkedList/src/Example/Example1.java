package Example;

import java.util.LinkedList;
import java.util.List;

public class Example1 {

    public static void main(String[] args) {
        // Non-Generic LinkedList
        List linkedList1 = new LinkedList();

        linkedList1.add("A");
        linkedList1.add("B");
        linkedList1.add("C");

        System.out.println(linkedList1);

        // Generic LinkedList
        LinkedList<Integer> linkedList2 = new LinkedList<Integer>();

        linkedList2.add(3);
        linkedList2.add(4);
        linkedList2.add(23);

        System.out.println(linkedList2);

    }

}
