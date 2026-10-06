public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa();
        casa.preco = 450000.00;
        casa.area = 150.0;
        double valorM2 = casa.preco / casa.area;

        System.out.println("Preço da casa: R$ " + casa.preco);
        System.out.println("Área: " + casa.area + " m²");
        System.out.printf("Valor do metro quadrado: R$ %.2f%n", valorM2);
    }
}
