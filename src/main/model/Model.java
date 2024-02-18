package main.model;

// Модель приложения, содержащая данные и бизнес-логику
public class Model {
    private ComplexNumber num1;
    private ComplexNumber num2;

    public void setNum1(ComplexNumber num1) {
        this.num1 = num1;
    }

    public void setNum2(ComplexNumber num2) {
        this.num2 = num2;
    }

    public ComplexNumber calculateResult(ComplexOperationStrategy strategy) {
        ComplexCalculator calculator = new ComplexCalculator(strategy);
        return calculator.calculate(num1, num2);
    }
}
