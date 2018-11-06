package pl.kasieksoft.foobar;

public class FooBar {

    public static void main(String[] args) {
        displayString(100, 3, "Foo", 5, "Bar");
    }

    private static void displayString(int number, int divider1, String pattern1, int divider2, String pattern2) {
        for (int i = 0; i <= number; i++)
            System.out.println(i + " " + addWord(i, divider1, pattern1) + addWord(i, divider2, pattern2));
    }

    static String addWord(int number, int divider, String pattern) {
        return (number % divider == 0) ? pattern : "";
    }
}
