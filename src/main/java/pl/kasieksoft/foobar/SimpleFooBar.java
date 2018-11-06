package pl.kasieksoft.foobar;

public class SimpleFooBar {

    public static void main(String[] args) {
        foobar(100);
    }

    private static void foobar(int count) {
        System.out.println(0);
        for (int i = 1; i <= count; i++) {
            System.out.print(i + " ");
            if (i % 3 == 0) {
                System.out.print("Foo");
            }
            if (i % 5 == 0) {
                System.out.print("Bar");
            }
            System.out.println();
        }
    }
}
