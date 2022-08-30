public class Test {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        titleToNumber("ZY");

    }

    public static int titleToNumber(String columnTitle) {
        int colNum = 0;

        int con = 26;

        String aZ = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println("Length:" + columnTitle.length());
        if (columnTitle.length() > 1) {
            for (int i = 0; i < columnTitle.length() - 1; i++) {

                char letter = columnTitle.charAt(i);
                int index1 = aZ.indexOf(letter);
                int temp = con * (index1 + 1);
                colNum = +temp;

                System.out.println("Index:" + index1);
                System.out.println("temp:" + temp);
                System.out.println("colNum:" + colNum);
            }
            char letter = columnTitle.charAt(columnTitle.length() - 1);
            int index2 = aZ.indexOf(letter);
            int temp = (index2 + 1);
            colNum = colNum + temp;
            System.out.println("Index2:" + index2);
            System.out.println("temp:" + temp);
            System.out.println("colNum:" + colNum);
        } else {
            int index = aZ.indexOf(columnTitle);

            colNum = colNum + (index + 1);
        }

        System.out.println(colNum);

        return colNum;
    }
}