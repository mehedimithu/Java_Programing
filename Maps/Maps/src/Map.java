import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String, String> cities = new HashMap<String, String>();

        cities.put("Bangladesh", "Dhaka");
        cities.put("Japan", "Tokeyo");
        cities.put("USA", "New York");
        cities.put("England", "London");

        for(String i: cities.keySet()){
            System.out.println("Country: "+ i + " Capital: " + cities.get(i));
        }
    }

}
