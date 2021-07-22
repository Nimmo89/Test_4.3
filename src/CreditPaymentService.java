public class CreditPaymentService {
    public double calculate(double month) {
        double m1 = 9.99 / 12 / 100; // Константа
        double payment = (m1 * Math.pow(1 + m1, month)) / (Math.pow(1 + m1, month) - 1); // Расчет процентов
        return (payment);
    }
}