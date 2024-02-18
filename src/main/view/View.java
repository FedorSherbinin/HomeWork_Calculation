package main.view;

import main.model.ComplexNumber;
import main.util.Logger;

import java.util.Scanner;

// Представление и контроллер приложения
public class View {
    private Scanner scanner;

    public View() {
        this.scanner = new Scanner(System.in);
    }

    public ComplexNumber readComplexNumber(String prompt) {
        System.out.println(prompt);
        System.out.print("Введите реальную часть: ");
        double real = scanner.nextDouble();
        System.out.print("Введите мнимую часть: ");
        double imaginary = scanner.nextDouble();

        return new ComplexNumber(real, imaginary);
    }

    // Метод для чтения выбора операции от пользователя
    public int readMenuChoice() {
        System.out.println("Выберите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        System.out.println("0. Завершить");

        return scanner.nextInt();
    }

    // Метод для проверки желания пользователя выполнить еще одну операцию
    public boolean wantToContinue() {
        System.out.print("Хотите выполнить еще одну операцию? (y/n): ");
        String answer = scanner.next().toLowerCase();

        return answer.equals("y");
    }

    // Метод для отображения результата
    public void displayResult(String result) {
        Logger.logResult(result);
    }

    // Метод для отображения логов
    public void displayLog(String message) {
        Logger.log(message);
    }
}
