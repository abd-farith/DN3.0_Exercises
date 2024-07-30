public class Main {
    public static void main(String[] args) {
        FutureValueCalculator calculator = new FutureValueCalculator();
        double presentValue = 1000.0;
        double growthRate = 0.05;
        int periods = 10;

        double futureValue = calculator.calculateFutureValue(presentValue, growthRate, periods);
        System.out.println("Future Value: " + futureValue);
    }
}
