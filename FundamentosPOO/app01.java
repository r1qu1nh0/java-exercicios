
public class app01 {
    public static void main(String[] args) {
        Aluno aluno1;

        // define uma variável do tipo aluno
    aluno1 = new Aluno();
    
    //aluno1.nome = "Enrico";
    //encapsulamento, esconde o dado
    //aluno1.idade = 22;

    aluno1.alterarIdade(22);
    aluno1.alterarIdade(-22);
    //aluno1.ra = 40028922;
    aluno1.apresentar();

    // com o s.out e você criando uma nova variável como esse do Alterar Idade
    // ele pode exibir sua idade através do return, apesar de estar escondido. 
    System.out.println("Idade = " + aluno1.obterIdade());

    }
}
