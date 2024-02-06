public class RuntimeErrors {

    public static void main(String[] args) {

    }

    public void nullPointerExceptionExample() {
        String text = null;
        int length = text.length(); // This will throw NullPointerException;
    }

    public void arrayIndexOutOfBoundsExceptionExample() {
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[3]); // This will throw ArrayIndexOutOfBoundsException
    }

    public void arithmeticExceptionExample() {
        int result = 10 / 0; // This will throw ArithmeticException
    }

    public void numberFormatExceptionExample() {
        String text = "1234";
        int value = Integer.parseInt(text); // This will throw NumberFormatException pareseInt -- sees int in a string but not 'abc'
    }

    public static void recursiveMethod(int num) {
        recursiveMethod(num); // This will eventually throw StackOverflowError -- never stops itself
    }
}
