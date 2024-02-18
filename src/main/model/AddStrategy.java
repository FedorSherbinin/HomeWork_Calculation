package main.model;

// Конкретная стратегия для операции сложения комплексных чисел
public class AddStrategy implements ComplexOperationStrategy {
    @Override
    public ComplexNumber execute(ComplexNumber num1, ComplexNumber num2) {
        return num1.plus(num2);
    }
}
