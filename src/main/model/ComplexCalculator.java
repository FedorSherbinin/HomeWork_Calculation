package main.model;

// Класс для выполнения операций с комплексными числами
public class ComplexCalculator {
    private ComplexOperationStrategy strategy;

    public ComplexCalculator(ComplexOperationStrategy strategy) {
        this.strategy = strategy;
    }

    public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {
        return strategy.execute(num1, num2);
    }
}
