package pl.kasieksoft.christmastree;

public class ChristmasTree {

    public static void main(String[] args) {
        printChristmasTree(21);
    }

    private static void printChristmasTree(int size) {
        for (int i = 0; i <= size; i++) {
            printChars(size - i, ' ');
            printChars(2 * i - 1, '*');
            System.out.println();
        }
        printChars(size - 2, ' ');
        printChars(2, '*');

    }

    private static void printChars(int count, char charToPrint) {
        for (int i = 0; i < count; i++) {
            System.out.print(charToPrint);
        }
    }
}