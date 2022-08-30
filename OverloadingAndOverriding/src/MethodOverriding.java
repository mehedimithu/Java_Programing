public class MethodOverriding {

    void start() {
    };

}

class Test extends MethodOverriding {
    void start() {
        System.out.println("Machine started!");
    }

}