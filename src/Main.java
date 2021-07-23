public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int paymentFor12Month = (int) service.calculate(9.99, 12, 1_000_000); // Расчет платежа
        System.out.println("Месячный платеж: " + paymentFor12Month);

        int paymentFor24Month = (int) service.calculate(9.99, 24, 1_000_000); // Расчет платежа
        System.out.println("Месячный платеж: " + paymentFor24Month);

        int paymentFor36Month = (int) service.calculate(9.99, 36, 1_000_000); // Расчет платежа
        System.out.println("Месячный платеж: " + paymentFor36Month);
    }
}
