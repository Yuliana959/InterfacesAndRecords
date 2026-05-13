package zadanie2;

@FunctionalInterface
public interface PriceStrategy {
    double calculate(ServiceOrder order);
}