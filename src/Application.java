import calculator.Calculator;
import calculator.RandomGenerator;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        RandomGenerator generator = new RandomGenerator();
        System.out.println(calculator.sum(generator.getSmallNUmber(), generator.getBigNumber()));
        System.out.println(calculator.substract(generator.getSmallNUmber(), generator.getBigNumber()));
        System.out.println(calculator.divide(generator.getSmallNUmber(), generator.getBigNumber()));
        System.out.println(calculator.multiply(generator.getSmallNUmber(), generator.getBigNumber()));
        System.out.println(calculator.factorial(5));
        System.out.println(calculator.factorial(10));
    }
}
