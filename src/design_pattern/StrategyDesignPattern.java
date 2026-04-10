package design_pattern;


interface PaymentStrategy {
    void pay(int amount);
}

class UpiPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class CardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Card");
    }
}

class PaymentContext {
    private PaymentStrategy strategy;

    public PaymentContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute(int amount) {
        strategy.pay(amount);
    }
}
public class StrategyDesignPattern {

    public static void main(String[] args) {
        PaymentStrategy strategy = new UpiPayment();
        PaymentContext context = new PaymentContext(strategy);
        context.execute(1000);
    }
}
