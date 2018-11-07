package pl.kasieksoft.christmastree;

public class ChristmasTree {

    public static void main(String[] args) {
        printChristmasTree(10);
    }

    private static void printChristmasTree(int size) {
        for (int i = 0; i <= size; i++) {
            printLine(size - i, " ");
            printLine(2 * i - 1, "*");
            System.out.println();
        }
        printLine(size - 2, " ");
        printLine(2, "*");

    }

    private static void printLine(int howMany, String whichString) {
        for (int i = 0; i < howMany; i++) {
            System.out.print(whichString);
        }
    }
}