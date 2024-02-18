package main.model;

// Интерфейс стратегии для операций с комплексными числами
public interface ComplexOperationStrategy {
    ComplexNumber execute(ComplexNumber num1, ComplexNumber num2);

}
