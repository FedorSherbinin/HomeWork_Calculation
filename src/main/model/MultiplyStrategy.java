package main.model;

// Конкретная стратегия для операции умножения комплексных чисел
public class MultiplyStrategy implements ComplexOperationStrategy {
    @Override
    public ComplexNumber execute(ComplexNumber num1, ComplexNumber num2) {
        return num1.times(num2);
    }
}
