package game;

public class FizzBuzzPlayer {
    public static String answer(int number) {
        return isFizz(number) ? "Fizz" : "Buzz";
    }

    private static boolean isFizz(int number) {
        return number == 3;
    }
}
