package main.model;

import java.util.HashMap;
import java.util.Map;

// Модель приложения, содержащая данные и бизнес-логику
public class Model {
    private Map<String, ComplexNumber> complexNumbers;
    private ComplexNumber num1;
    private ComplexNumber num2;

    public Model() {
        this.complexNumbers = new HashMap<>();
    }

    public void setNum1(ComplexNumber num1) {
        this.num1 = num1;
        addToComplexNumbers("num1", num1);
    }

    public void setNum2(ComplexNumber num2) {
        this.num2 = num2;
        addToComplexNumbers("num2", num2);
    }

    public ComplexNumber calculateResult(ComplexOperationStrategy strategy) {
        ComplexCalculator calculator = new ComplexCalculator(strategy);
        ComplexNumber result = calculator.calculate(num1, num2);
        addToComplexNumbers("result", result);
        return result;
    }

    private void addToComplexNumbers(String key, ComplexNumber complexNumber) {
        complexNumbers.put(key, complexNumber);
    }

    public Map<String, ComplexNumber> getComplexNumbers() {
        return complexNumbers;
    }
}
