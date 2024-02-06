public class LogicalErrors {

    public void offByOneError() {
        // Intended to print numbers 1 to 5, but misses the last number, can you see why?
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    public void wrongOperatorError() {
        int a = 10;
        int b = 5;
        // what's wrong with the boolean expression below? Look closely as the operator...
        if (a == b) {
            System.out.println("a equals b");
        }
    }

    public void incorrectlyInitializedVariableError() {
        int total = 0;
        for (int i = 1; i <= 5; i++) {
            total += i;
        }
        System.out.println("Total: " + total); // The total is off by 1, can you see why?
    }

    public void confusingAndOrError() {
        int a = 10, b = 5, c = 7;
        // Intended to check if 'c' is between 'a' and 'b', where does it go wrong?
        if (c > a && c < b) {
            System.out.println("c is between a and b");
        }
    }

    public void infiniteLoopError() {
        int i = 0;
        // Can you see why this causes an infinite loop?
        while (i < 10) {
            i--;
        }
    }
}