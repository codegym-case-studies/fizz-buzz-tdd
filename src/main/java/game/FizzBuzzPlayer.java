package game;

public class FizzBuzzPlayer {
    public static String answer(int number) {
        if (isFizz(number)) {
            return "Fizz";
        } else if (isBuzz(number)) {
            return "Buzz";
        }
        return "1";
    }

    private static boolean isFizz(int number) {
        return number == 3;
    }

    private static boolean isBuzz(int number) {
        return number == 5;
    }
}
