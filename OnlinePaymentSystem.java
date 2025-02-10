// Abstract class for PaymentMethod
abstract class PaymentMethod {

    public abstract void processPayment();
}


class CreditCard extends PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Processing payment through Credit Card. A fee of 2% is charged.");
    }
}

class PayPal extends PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Processing payment through PayPal. No additional fee.");
    }
}


class Transaction {
    public void processTransaction(PaymentMethod paymentMethod) {
        paymentMethod.processPayment();  // Calls the overridden method of the object passed
    }
}


public class OnlinePaymentSystem {
    public static void main(String[] args) {

        PaymentMethod creditCard = new CreditCard();
        PaymentMethod payPal = new PayPal();
        

        Transaction transaction = new Transaction();
        

        System.out.println("Payment 1: ");
        transaction.processTransaction(creditCard);  
        
        System.out.println("\nPayment 2: ");
        transaction.processTransaction(payPal);  
    }
}

