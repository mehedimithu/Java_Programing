public class MethodOverloading {
    
    static int add(int a, int b){
        return  a+b;
    }
    static int add(int a, int b, int c){
        return  a+b+c;
    }

    public static void main(String[] args) {
       int results = add(12, 10);
       int result2 = add(12, 12, 1);

        System.out.println(results);
        System.out.println(result2);
    }
}
