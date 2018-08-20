package game;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FizzBuzzPlayerTest {
    private static final String FIZZ = "Fizz";

    @Test
    public void testFizz() {
        final int input = 3;
        String actual = FizzBuzzPlayer.answer(input);
        assertTrue(FIZZ.equals(actual));
    }

}
