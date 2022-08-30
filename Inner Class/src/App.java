public class App {
    public static void main(String[] args) throws Exception {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        
        System.out.println(innerClass.testMethod());
        System.out.println(innerClass.y + outerClass.x);
    }
}
