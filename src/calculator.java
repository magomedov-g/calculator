public class calculator {
    public static int CharacterInput(int a, int b, String symbol) {
        switch (symbol) {
            case "*":
                return (a * b);
            case "/":
                return (a / b);
            case "+":
                return (a + b);
            case "-":
                return (a - b);
            default:
            throw new IllegalStateException("Invalid input: ");
        }
    }
}
