public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int mortgageAmount = 1_000_000;
        int month = 36;
        int paymentForMonth = (int) (service.calculate(month) * mortgageAmount); // Расчет платежа
        System.out.println("Месячный платеж: " + paymentForMonth);
    }
}
