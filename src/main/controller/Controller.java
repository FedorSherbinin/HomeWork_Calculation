package main.controller;

import main.model.*;
import main.view.View;

import java.util.HashMap;
import java.util.Map;

// Контроллер приложения
public class Controller {
    private Model model;
    private View view;
    private Map<Integer, ComplexOperationStrategy> operationStrategies;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        this.operationStrategies = initializeOperationStrategies();
    }

    public void processUserInput() {
        while (true) {
            ComplexNumber num1 = view.readComplexNumber("Введите первое комплексное число:");
            ComplexNumber num2 = view.readComplexNumber("Введите второе комплексное число:");

            int choice = view.readMenuChoice();

            ComplexOperationStrategy strategy = operationStrategies.get(choice);
            if (strategy != null) {
                model.setNum1(num1);
                model.setNum2(num2);
                ComplexNumber result = model.calculateResult(strategy);
                view.displayResult(result);
            } else {
                view.displayLog("Неверный выбор операции.");
            }

            if (!view.wantToContinue()) {
                view.displayLog("Программа завершена.");
                break;
            }
        }
    }

    private Map<Integer, ComplexOperationStrategy> initializeOperationStrategies() {
        Map<Integer, ComplexOperationStrategy> strategies = new HashMap<>();
        strategies.put(1, new AddStrategy());
        strategies.put(2, new SubtractStrategy());
        strategies.put(3, new MultiplyStrategy());
        strategies.put(4, new DivideStrategy());
        return strategies;
    }
}