package design_pattern;

interface Payment {
    void pay();
}

class UPIPayment implements Payment {
    public void pay() {
        System.out.println("Paid using UPI");
    }
}

class CARDPayment implements Payment {
    public void pay() {
        System.out.println("Paid using Card");
    }
}
class PaymentFactory {

    public static Payment getPayment(String type) {
        if (type.equalsIgnoreCase("UPI")) {
            return new UPIPayment();
        } else if (type.equalsIgnoreCase("CARD")) {
            return new CARDPayment();
        }
        throw new IllegalArgumentException("Invalid payment type");
    }
}
public class FactoryDesignPattern {

    public static void main(String[] args) {
        Payment payment=PaymentFactory.getPayment("UPI");
        payment.pay();
    }
}
