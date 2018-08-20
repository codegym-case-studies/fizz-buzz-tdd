package game;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzPlayerTest {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    @Test
    public void testFizz() {
        final int input = 3;
        String actual = FizzBuzzPlayer.answer(input);
        assertEquals(FIZZ, actual);
    }

    @Test
    public void testBuzz() {
        final int input = 5;
        String actual = FizzBuzzPlayer.answer(input);
        assertEquals(BUZZ, actual);
    }

}
