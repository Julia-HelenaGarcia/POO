public class Main {
    public static void main(String[] args) {
        CalculadoraFinanceira calc = new CalculadoraFinanceira();

        System.out.println("--- Sem parcelamento ---");
        calc.calcularDesconto(1200.00, 10);

        System.out.println();
        System.out.println("--- Com parcelamento ---");
        calc.calcularDesconto(1200.00, 10, 6);
    }
}
