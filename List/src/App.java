import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> topCities = new ArrayList<>();

        topCities.add("New York");
        topCities.add("London");
        topCities.add("Paris");
        topCities.add("Toronto");


        String secondCity = topCities.get(1);
        int size = topCities.size();
        boolean isTokyoAdded = topCities.contains("Tokyo");

        System.out.println("Top Cities: ");
        System.out.println(topCities);
        System.out.println(secondCity);
        System.out.println(size);
        System.out.println(isTokyoAdded);

    }
}
