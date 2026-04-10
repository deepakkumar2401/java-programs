package design_pattern;

interface OldPayment {
    void makePayment();
}

interface NewPayment {
    void pay();
}

class PaymentAdapter implements NewPayment {

    private OldPayment oldPayment;

    public PaymentAdapter(OldPayment oldPayment) {
        this.oldPayment = oldPayment;
    }

    public void pay() {
        oldPayment.makePayment();
    }
}
public class AdapterDesignPattern {

    public static void main(String[] args) {
    }
}
