package calculator;

public class Calculator {
    public int sum(int a, int b) {
        return a+b;
    }
    public int substract (int a, int b) {
        return a-b;
    }
    public int divide(int a, int b) {
        if (b==0){
            System.out.println("cant divide by 0");
        }
        return a/b;
    }
    public int multiply(int a, int b) {
        return a*b;
    }

}
