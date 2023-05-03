public class Funcionario extends Pessoa {
    private double salario;
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }

    public Funcionario(String nome, int idade, String endereco, double salario){
        super(nome, idade, endereco);
        setSalario(salario);
    }
    public Funcionario(){

    }
    
}
