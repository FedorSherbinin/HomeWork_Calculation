package main.model;

// Конкретная стратегия для операции вычитания комплексных чисел
public class SubtractStrategy implements ComplexOperationStrategy {
    @Override
    public ComplexNumber execute(ComplexNumber num1, ComplexNumber num2) {
        return num1.minus(num2);
    }
}
