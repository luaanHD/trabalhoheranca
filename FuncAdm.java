public class FuncAdm extends Funcionario {
    private String setor;
    private String funcao;

    public void setSetor(String setor) {
        this.setor = setor;
    }
    public String getSetor() {
        return setor;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public String getFuncao() {
        return funcao;
    }
    
    public FuncAdm(String nome, int idade, String endereco, double salario, String setor, String funcao){
        super(nome, idade, endereco, salario);
        setSetor(setor);
        setFuncao(funcao);
    }
    public FuncAdm(){

    }
    
}
