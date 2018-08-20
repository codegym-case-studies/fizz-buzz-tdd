package game;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FizzBuzzPlayerTest {
    @Test
    public void testFizz() {
        final int input = 3;
        String actual = FizzBuzzPlayer.answer(input);
        String expected = "Fizz";
        assertTrue(expected.equals(actual));
    }

}
