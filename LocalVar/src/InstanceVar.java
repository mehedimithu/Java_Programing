/**
 * instanceVar
 */

public class InstanceVar {
    String Name = "Mehedi";
    int id =10;
    double marks = 89.0;


    public static void main(String[] args) {
        InstanceVar obj1 = new InstanceVar();

        obj1.show();

        System.out.println("End");
    }

    public void show(){
        System.out.println("Name:\s"+ Name + "\sid:\s" + id + "\smarks:\s"+ marks);

    }

    
}