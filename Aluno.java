// class = Modelo

import java.util.Set;

public class Aluno {
    // atributos = características, informações
    private long ra;
    private String nome;
    private int idade;

    public void alterarIdade(int novaIdade) {
        if (novaIdade > 0) {
            idade = novaIdade;

            
        }
    }
    // com esse comando, poderá ser exibido a idade
    public int obterIdade() {
        return idade;
    }
    //Usando o "get" ou "set", consegue reaproveitar o código. 
  public String getNome() {
      return nome;
  }
  public void setNome(String nome) {
      this.nome = nome;
  }
  public long getRa() {
      return ra;
  }  
    //Aluno é capaz de realizar ações
void apresentar() {
    System.out.println("Olá! Sou " + nome + " tenho " + idade + " anos ");
}



}
