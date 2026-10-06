public class Funcionario extends Pessoa {
    private double salario;
    private String cargo;
    private String departamento;
    private boolean aprendiz;

    public Funcionario(String nome, int idade, String email,
                       double salario, String cargo, String departamento) {
        super(nome, idade, email);
        this.salario = salario;
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public double getSalario() { return salario; }
    public String getCargo() { return cargo; }
    public String getDepartamento() { return departamento; }
    public boolean isAprendiz() { return aprendiz; }
    public void setAprendiz(boolean aprendiz) { this.aprendiz = aprendiz; }
}
