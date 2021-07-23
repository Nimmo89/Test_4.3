public class CreditPaymentService {
    public double calculate(double percent, double month, double mortgageAmount) {
        double m1 = percent / 12 / 100; // Константа
        double payment = (m1 * Math.pow(1 + m1, month)) / (Math.pow(1 + m1, month) - 1) * mortgageAmount; // Расчет процентов
        return (payment);
    }
}