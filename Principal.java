public class Principal {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("José Cláudio Fernandéz", 27, "Rua Changsheng,Liyue - 276", 1250.85);
        Aluno aluno = new Aluno("Higor Rafael Nando", 17, "Rua Manoel Gomez, Sumeru - 278", "5º Semestre", "Informática para Internet");
        Professor professor = new Professor("Marco Antônio Katahira", 39,"Rua Baizhu, Liyue - 181", 19200.85, "PW2");
        Pessoa pessoa = new Pessoa("Eduardo Coreano Rorato", 23, "Rua Marialva, Paraná - 652");
        FuncAdm funcAdm = new FuncAdm("Paulo Ricardo Gusmão", 34, "Rua Getúlio Vargas, São Paulo - 579", 2345.67, "Administrativo", "Assistente técnico da biblioteca");

        System.out.println("Nome do funcionário é: " + funcionario.getNome());
        System.out.println("Idade do funcionário é: " + funcionario.getIdade());
        System.out.println("Endereço do funcionário: " + funcionario.getEndereco());
        System.out.println("Salário do funcionário: " + funcionario.getSalario());
        System.out.println("\n");

        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Idade do aluno: " + aluno.getIdade());
        System.out.println("Endereço do aluno: " + aluno.getEndereco());
        System.out.println("Semestre: " + aluno.getSemestre());
        System.out.println("Curso: " + aluno.getCurso());
        System.out.println("\n");

        System.out.println("Nome do Professor: "+ professor.getNome());
        System.out.println("Idade do professor: " + professor.getIdade());
        System.out.println("Endereço do professor: " + professor.getEndereco());
        System.out.println("Salário do professor: " + professor.getSalario());
        System.out.println("Disciplina Ministrada: " + professor.getDisciplina());
        System.out.println("\n");

        System.out.println("Nome da pessoa: " + pessoa.getNome());
        System.out.println("Idade da pessoa: " + pessoa.getIdade());
        System.out.println("Endereço da pessoa: " + pessoa.getEndereco());
        System.out.println("\n");

        System.out.println("Nome do funcionário administrativo: " + funcAdm.getNome());
        System.out.println("Idade: " + funcAdm.getIdade());
        System.out.println("Endereço: " + funcAdm.getEndereco());
        System.out.println("Salário: " + funcAdm.getSalario());
        System.out.println("Setor trabalhado: " + funcAdm.getSetor());
        System.out.println("Função na qual trabalha: " + funcAdm.getFuncao());
    }
}
