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
        double real = scanner.nextDouble();
        System.out.println("Введите мнимую часть:");
        double imaginary = scanner.nextDouble();
        return new ComplexNumber(real, imaginary);
    }

    public int readMenuChoice() {
        System.out.println("Выберите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");

        return scanner.nextInt();
    }

    public boolean wantToContinue() {
        System.out.println("Хотите выполнить еще одну операцию? (yes/no)");
        String choice = scanner.next().toLowerCase();
        Logger.log("Выбор пользователя: " + choice);
        return choice.equals("yes");
    }

    public void displayResult(ComplexNumber result) {
        System.out.println(result);
        Logger.logResult(result.toString());
    }

    public void displayLog(String message) {
        Logger.log(message);
    }
}
