package calculator;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(5,10));
        System.out.println(calculator.divide(3,6));
        System.out.println(calculator.multiply(4,7));
    }
}
