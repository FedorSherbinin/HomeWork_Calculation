package main.model;

// Класс для представления комплексных чисел
public class ComplexNumber {
    private double real;
    private double imaginary;

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

    public double getRadius() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public double getArgument() {
        return Math.atan2(imaginary, real);
    }

    public String getExponentialForm() {
        double radius = getRadius();
        double argument = getArgument();
        return String.format("e^(i * %.4f) = %.4f * (cos(%.4f) + i * sin(%.4f))", argument, radius, argument, argument);
    }

    public String getTrigonometricForm() {
        double radius = getRadius();
        double argument = getArgument();
        return String.format("%.4f * (cos(%.4f) + i * sin(%.4f))", radius, argument, argument);
    }

    @Override
    public String toString() {
        return "Алгебраическая форма: " + real + " + " + imaginary + "i, \nРадиус: " + getRadius() + ", \nАргумент: " + getArgument()
                + "\nПоказательная форма: " + getExponentialForm() + "\nТригонометрическая форма: " + getTrigonometricForm();
    }
}
