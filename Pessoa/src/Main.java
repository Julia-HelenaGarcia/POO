import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pessoa pessoa = new pessoa();

        System.out.print("Informe a idade: ");
        pessoa.setIdade(Integer.parseInt(sc.nextLine().trim()));

        if (pessoa.getIdade() >= 18) {
            System.out.println("Apta a tirar a carteira de motorista.");
        } else {
            System.out.println("Não está apta a tirar a carteira de motorista.");
        }
        sc.close();
    }
}
