public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        long result = service.calculate(1_000_000, 24);
        System.out.println("Аннуитетный платеж = " + result);
    }
}
