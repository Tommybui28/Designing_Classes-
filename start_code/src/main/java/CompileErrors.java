public class CompileErrors {

    public static void Main(String[] args) {

    }

    public void syntaxError() {
        int x = 10; // Syntax error: (?)
        int y = 5; // Syntax error: (?)
        System.out.println(x);
    }

    public void typeMismatchError() {
        int number = 123; // Type mismatch error: cannot convert from String to int
    }

    public int missingReturnStatement() {
        int a = 100;
        int b = 200;
        // Missing return statement error
        return a+b;
    }

    public void cannotFindSymbolError() {
        String undeclaredVariable = "";
        System.out.println(undeclaredVariable); // Cannot find symbol error
    }

    public void someMethod(int a, String b) {
        // Method logic
    }

    public void methodCallWithWrongArgumentsError() {
        someMethod(123, "456"); // Method call with wrong arguments error
    }

    public static void accessNonStaticFromStaticContextError() {

        System.out.println(nonStaticVariable); // Accessing non-static variable from static context error
    }

}
