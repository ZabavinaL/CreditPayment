public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        long result1 = service.calculate(1_000_000);
//        System.out.println("Аннуитентный платеж при сроке кредита - 1 год = " + result1);

        long result2 = service.calculate(1_000_000);
        System.out.println("Аннуитентный платеж при сроке кредита - 2 года = " + result2);

        long result3 = service.calculate(1_000_000);
//        System.out.println("Аннуитентный платеж при сроке кредита - 3 года = " + result3);


    }
}
