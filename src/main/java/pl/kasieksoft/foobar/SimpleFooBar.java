package pl.kasieksoft.foobar;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class SimpleFooBar implements FooBar {

    public static void main(String[] args) {
        for (String line : new SimpleFooBar().foobar(100)) {
            System.out.println(line);
        }
    }

    @Override
    public Collection<String> foobar(int count) {
        if (count < 0) {
            throw new IllegalArgumentException("Please input a positive number");
        }
        List<String> result = new LinkedList<>();
        result.add("0");
        for (int i = 1; i <= count; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(i).append(" ");
            if (i % 3 == 0) {
                stringBuilder.append("Foo");
            }
            if (i % 5 == 0) {
                stringBuilder.append("Bar");
            }
            result.add(stringBuilder.toString());
        }
        return result;
    }
}
