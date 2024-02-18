package main.controller;

import main.model.ComplexOperationStrategy;
import main.model.*;
import main.view.View;

// Контроллер приложения
public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUserInput() {
        while (true) {
            ComplexNumber num1 = view.readComplexNumber("Введите первое комплексное число:");
            ComplexNumber num2 = view.readComplexNumber("Введите второе комплексное число:");

            int choice = view.readMenuChoice();

            if (choice == 0) {
                view.displayLog("Программа завершена.");
                break;
            }

            ComplexOperationStrategy strategy = getStrategyByChoice(choice);
            model.setNum1(num1);
            model.setNum2(num2);
            ComplexNumber result = model.calculateResult(strategy);
            view.displayResult(result.toString());

            if (!view.wantToContinue()) {
                view.displayLog("Программа завершена.");
                break;
            }
        }
    }

    private ComplexOperationStrategy getStrategyByChoice(int choice) {
        switch (choice) {
            case 1:
                return new AddStrategy();
            case 2:
                return new SubtractStrategy();
            case 3:
                return new MultiplyStrategy();
            case 4:
                return new DivideStrategy();
            default:
                view.displayLog("Неверный выбор операции.");
                return null;
        }
    }
}
