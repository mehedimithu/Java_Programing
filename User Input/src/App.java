import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter name and age");
        String name = userInput.nextLine();
        int age = userInput.nextInt();
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }
}
