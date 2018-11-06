package pl.kasieksoft.multiplication;

public class MultiplicationTable {
    public static void main(String[] args) {
        printMultiplicationTable(17);
    }

    private static void printMultiplicationTable(int size) {
        System.out.print("      ");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
        }
        System.out.print("\n\n");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
            System.out.print("  ");
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
