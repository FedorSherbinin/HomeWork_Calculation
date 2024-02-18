package main.model;

// Конкретная стратегия для операции вычитания комплексных чисел
public class SubtractStrategy implements ComplexOperationStrategy {
    @Override
    public ComplexNumber execute(ComplexNumber num1, ComplexNumber num2) {
        double realDifference = num1.getReal() - num2.getReal();
        double imaginaryDifference = num1.getImaginary() - num2.getImaginary();
        return new ComplexNumber(realDifference, imaginaryDifference);
    }
}
