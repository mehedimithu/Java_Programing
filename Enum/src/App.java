
public class App {
    public static void main(String[] args) throws Exception {
        LevelUp level = LevelUp.HIGH;

        switch (level) {
            case LOW:
                System.out.println("Low Level");
                break;
            case HIGH:
                System.out.println("High Level");
                break;
            case MEDIUM:
                System.out.println("Medium Level");
                break;
            default:
                System.out.println("Out of scope");
        }
    }
}
