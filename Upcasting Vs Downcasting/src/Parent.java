class Parent {
    String name;

    void method() {
        System.out.println("Parent method is called");
    };
}

class Child extends Parent {
    int id;

    void method() {
        System.out.println("Child method is called");

    }

}