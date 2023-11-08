package oneTask;

public class СonvertNumber {
    public static String convertNumber(int number) {
        return (number > 0) ? (number % 7 < 4 ? "positive-m" : "positive-p") :
                (number == 0 ? "zero" : (number % 7 > -4 ? "negative-m" : "negative-p"));
    }
}