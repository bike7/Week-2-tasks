package pl.kasieksoft.pascaltriangle;

public class PascalTriangle {

    public static void main(String[] args) {
        printPascalTriangle(20);
    }

    private static void printPascalTriangle(int rows) {
        for (int i = 0; i < rows; i++) {

            printSpaces((rows - i) * 3);

            for (int j = 0; j <= i; j++) {
                System.out.printf("%6d", pascalValue(i, j));
            }

            System.out.println();
        }
    }

    private static int pascalValue(int i, int j) {
        return (j == 0 || j == i) ? 1 : pascalValue(i - 1, j - 1) + pascalValue(i - 1, j);
    }

    private static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(' ');
        }
    }

}