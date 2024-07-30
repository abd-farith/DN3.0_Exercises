public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        PaymentStrategy creditCardPayment = new CreditCardPayment("1234567890123456", "John Doe");
        context.setPaymentStrategy(creditCardPayment);
        context.pay(150.75);

        PaymentStrategy payPalPayment = new PayPalPayment("farith@example.com");
        context.setPaymentStrategy(payPalPayment);
        context.pay(85.50);
    }
}
