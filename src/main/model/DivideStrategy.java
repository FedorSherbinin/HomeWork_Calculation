package main.model;

// Конкретная стратегия для операции деления комплексных чисел
public class DivideStrategy implements ComplexOperationStrategy {
    @Override
    public ComplexNumber execute(ComplexNumber num1, ComplexNumber num2) {
        return num1.dividedBy(num2);
    }
}
