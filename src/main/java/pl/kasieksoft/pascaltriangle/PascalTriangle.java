package pl.kasieksoft.pascaltriangle;

public class PascalTriangle {

    public static void main(String[] args) {
        printPascalTriangle(10);
    }

    private static void printPascalTriangle(int rows) {
        for (int i = 0; i < rows; i++) {

            printSpace((rows - i) * 2);

            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", pascalValue(i, j));
            }

            System.out.println();
        }
    }

    private static int pascalValue(int i, int j) {
        if (j == 0) {
            return 1;
        } else if (j == i) {
            return 1;
        } else {
            return pascalValue(i - 1, j - 1) + pascalValue(i - 1, j);
        }
    }

    private static void printSpace(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(' ');
        }
    }

}