abstract class PaymentMethod {
    abstract void processPayment(double amount);
}


class CreditCard extends PaymentMethod {
    @Override
    void processPayment(double amount) {
        double fee = 0.02 * amount; 
        System.out.println("Processing Credit Card payment of Rs." + (amount + fee) + " (including Rs." + fee + " fee)");
    }
}


class PayPal extends PaymentMethod {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing PayPal payment of Rs." + amount + " (No additional fee)");
    }
}


class TransactionProcessor {
    static void processTransaction(PaymentMethod paymentMethod, double amount) {
        paymentMethod.processPayment(amount); 
    }
}


public class OnlinePaymentSystem {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod payPal = new PayPal();
        
        TransactionProcessor.processTransaction(creditCard, 1000);
        TransactionProcessor.processTransaction(payPal, 1000);
    }
}

