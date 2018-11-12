package pl.kasieksoft.foobar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FooBarTest {

    private FooBar foobar;

    @BeforeEach
    void setUp() {
        foobar = new SimpleFooBar();
    }

    @Test
    void shouldReturnSimpleFooBar() {
        //given
        int size = 15;
        Collection<String> expected = Arrays.asList("0", "1 ", "2 ", "3 Foo", "4 ", "5 Bar", "6 Foo", "7 ", "8 ", "9 Foo", "10 Bar", "11 ", "12 Foo", "13 ", "14 ", "15 FooBar");
        //when
        Collection<String> result = foobar.foobar(size);
        //then
        assertEquals(expected, result);
    }

    @Test
    void shouldReturnEmptyCollectionForZero() {
        //given
        int size = 0;
        Collection<String> expected = Collections.singletonList("0");
        //when
        Collection<String> result = foobar.foobar(size);
        //then
        assertEquals(expected, result);

    }

    @Test
    void shouldThrowIllegalArgumentExceptionForNegativeParameter() {
        //given
        int size = -5;
        //when
        //then
        assertThrows(IllegalArgumentException.class, () -> foobar.foobar(size));
    }
}