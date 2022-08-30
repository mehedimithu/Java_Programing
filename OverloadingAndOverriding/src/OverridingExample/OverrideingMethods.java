package OverridingExample;

public class OverrideingMethods {
    public static void main(String[] args) {

        // Animal object
        Animal a1 = new Animal(); // references to animal class
        Animal a2 = new Cat();   // Animal references to Cat class

        a1.talk();
        a2.talk();
    }

}
