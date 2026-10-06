import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n=== CADASTRO ACADÊMICO ===");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Professor");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = lerInt();

            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    cadastrarProfessor();
                    break;
                case 3:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);
    }

    static void cadastrarAluno() {
        System.out.print("Nome do aluno: ");
        String nome = sc.nextLine();
        System.out.print("Idade: ");
        int idade = lerInt();

        // Validação de idade: entre 16 e 99 (AND)
        if (idade >= 16 && idade <= 99) {
            System.out.print("Renda familiar (R$): ");
            double renda = lerDouble();
            System.out.print("Participa de projeto de extensão? (s/n): ");
            boolean extensao = lerBoolean();

            System.out.println("\nAluno " + nome + " cadastrado com sucesso!");

            // Validação de benefício: renda < 1500 OR extensão (OR)
            if (renda < 1500.00 || extensao) {
                System.out.println("Direito a auxílio estudantil: SIM");
            } else {
                System.out.println("Direito a auxílio estudantil: NÃO");
            }
        } else {
            System.out.println("Cadastro negado: idade inválida para ingressar no ensino superior.");
        }
    }

    static void cadastrarProfessor() {
        System.out.print("Nome do professor: ");
        String nome = sc.nextLine();
        System.out.print("Anos de experiência: ");
        int anosExperiencia = lerInt();
        System.out.print("Possui pós-graduação? (s/n): ");
        boolean temPosGraduacao = lerBoolean();
        System.out.print("É bacharel? (s/n): ");
        boolean ehBacharel = lerBoolean();

        // Parênteses isolam a verificação da formação (OR) da experiência (AND)
        String status;
        if (anosExperiencia > 2 && (temPosGraduacao == true || ehBacharel == true)) {
            status = "Efetivo";
        } else {
            status = "Temporário";
        }

        System.out.println("\nProfessor " + nome + " cadastrado com status: " + status);
    }

    static int lerInt() {
        return Integer.parseInt(sc.nextLine().trim());
    }

    static double lerDouble() {
        return Double.parseDouble(sc.nextLine().trim().replace(',', '.'));
    }

    static boolean lerBoolean() {
        String r = sc.nextLine().trim().toLowerCase();
        return r.equals("s") || r.equals("sim");
    }
}

