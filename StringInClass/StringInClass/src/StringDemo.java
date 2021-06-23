/**
 * String
 */
public class StringDemo {

    public static void main(String[] args) {

        String name = "Mehedi Hasan";
        String actuals = "do not love";
        String expected = "love me like you do";
        String unexpected = "Love me like you do";
        String fullLong = "A-B-C-D-E-F-G";

        boolean status = name.startsWith("Mehedi");
        boolean status1 = name.endsWith("Meh");
        boolean status2 = actuals.equals(expected);
        boolean status3 = expected.equalsIgnoreCase(unexpected);
        String[] alphabet = fullLong.split("-");

        for (int i = 0; i < alphabet.length; i++) {

            System.out.println(i+ "\sAlphabet is:\s" + alphabet[i]);

            if(alphabet[i].equalsIgnoreCase("c")){
                System.out.println("Passed");
                break;

            }
        }

        System.out.println("Status is:\s" + status);
        System.out.println("Status is:\s" + status1);
        System.out.println("Status is:\s" + status2);
        System.out.println("Status is:\s" + status3);

    }
}