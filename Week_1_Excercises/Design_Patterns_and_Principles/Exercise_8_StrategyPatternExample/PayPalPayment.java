public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println(email);
        System.out.println("Paid Rs." + amount + " using PayPal.");
    }
}
