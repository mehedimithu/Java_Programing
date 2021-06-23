public class App {
    public static void main(String[] args) throws Exception {
        App obj1 = new App();
        obj1.sum();
        System.out.println("End");
    }

    public void sum(){
        int a =10;
        int b = 20;
        int c = a+b;
        System.out.println("The sum is "+c);
    }
}
