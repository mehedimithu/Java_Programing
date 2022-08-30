package example;

public class EncapsulationMethod {
    public static void main(String[] args) {
        Encapsulation customar = new Encapsulation();

        customar.setAge(29);
        customar.setName("Test Customer");
        customar.setId("Test101");

        System.out.println(String.format("%s's with id %s is %s years old", customar.getName(), customar.getId(),
                customar.getAge()));
    }
}
