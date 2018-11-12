package pl.kasieksoft.foobar;

import java.util.*;

public class ObjectiveFooBar implements FooBar {

    private Map<Integer, String> patterns = new HashMap<>();

    public static void main(String[] args) {
        ObjectiveFooBar objectiveFooBar = new ObjectiveFooBar();
        objectiveFooBar.addPattern(3, "Foo");
        objectiveFooBar.addPattern(5, "Bar");
        objectiveFooBar.addPattern(11, "Too");
        objectiveFooBar.addPattern(22, "Moo");
        objectiveFooBar.print(40);

        ObjectiveFooBar objectiveFooBar2 = new ObjectiveFooBar();
        objectiveFooBar2.addPattern(4, "Foo");
        objectiveFooBar2.print(40);
    }

    private void addPattern(int divider, String pattern) {
        patterns.put(divider, pattern);
    }

    @Override
    public Collection<String> foobar(int count) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i <= count; i++) {
            result.add(i + " " + addWords(i));
        }
        return result;
    }

    private void print(int count) {
        for (String line : foobar(count)) {
            System.out.println(line);
        }
    }

    private String addWords(int currentNumber) {
        StringBuilder result = new StringBuilder();
        patterns.keySet().forEach(i -> result.append(MyFooBar.addWord(currentNumber, i, patterns.get(i))));
        return result.toString();
    }
}
