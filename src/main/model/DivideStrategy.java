package main.model;

// Конкретная стратегия для операции деления комплексных чисел
public class DivideStrategy implements ComplexOperationStrategy {
    @Override
    public ComplexNumber execute(ComplexNumber num1, ComplexNumber num2) {
        double divisor = num2.getReal() * num2.getReal() + num2.getImaginary() * num2.getImaginary();
        double real = (num1.getReal() * num2.getReal() + num1.getImaginary() * num2.getImaginary()) / divisor;
        double imaginary = (num1.getImaginary() * num2.getReal() - num1.getReal() * num2.getImaginary()) / divisor;
        return new ComplexNumber(real, imaginary);
    }
}
