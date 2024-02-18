package main.model;

// Класс для представления комплексных чисел
public class ComplexNumber {
    private double real;        // Реальная часть комплексного числа
    private double imaginary;   // Мнимая часть комплексного числа

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    // Операции над комплексными числами

    public ComplexNumber plus(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    public ComplexNumber minus(ComplexNumber other) {
        return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
    }

    public ComplexNumber times(ComplexNumber other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imagPart = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(realPart, imagPart);
    }

    public ComplexNumber dividedBy(ComplexNumber other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double realPart = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double imagPart = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new ComplexNumber(realPart, imagPart);
    }

    @Override
    public String toString() {
        return "(" + real + " + " + imaginary + "i)";
    }
}
