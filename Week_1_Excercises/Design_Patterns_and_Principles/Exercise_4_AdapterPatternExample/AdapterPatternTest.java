public class AdapterPatternTest {
    public static void main(String[] args) {
        PaymentProcessor paytmProcessor = new PaytmAdapter(new Paytm());
        paytmProcessor.processPayment(100.0);

        PaymentProcessor gpayProcessor = new GpayAdapter(new Gpay());
        gpayProcessor.processPayment(200.0);

        PaymentProcessor amazonPayProcessor = new AmazonPayAdapter(new AmazonPay());
        amazonPayProcessor.processPayment(300.0);
    }
}
