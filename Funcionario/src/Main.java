public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Ana Souza", 16, "ana@empresa.com",
                800.00, "Auxiliar administrativo", "RH");
        Funcionario f2 = new Funcionario("Carlos Lima", 28, "carlos@empresa.com",
                4500.00, "Desenvolvedor", "TI");

        f1.setAprendiz(f1.getIdade() <= 16);
        f2.setAprendiz(f2.getIdade() <= 16);

        exibir(f1);
        System.out.println();
        exibir(f2);
    }

    static void exibir(Funcionario f) {
        System.out.println("Nome: " + f.getNome());
        System.out.println("Idade: " + f.getIdade());
        System.out.println("E-mail: " + f.getEmail());
        System.out.println("Cargo: " + f.getCargo() + " (" + f.getDepartamento() + ")");
        System.out.println("Salário: R$ " + f.getSalario());
        System.out.println("Aprendiz: " + f.isAprendiz());
    }
}
