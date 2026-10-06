public class Main {
    public static void main(String[] args) {
        Casaa casa1 = new Casaa();
        casa1.endereco = "Rua das Flores, 100";
        casa1.preco = 300000.00;
        casa1.tipo = "Térrea";
        casa1.area = 120.0;

        Casaa casa2 = new Casaa("Av. Brasil, 2500", 750000.00, "Sobrado", 220.5);

        System.out.println("--- Casa 1 (construtor vazio) ---");
        casa1.exibir();
        System.out.println();
        System.out.println("--- Casa 2 (construtor completo) ---");
        casa2.exibir();
    }
}
