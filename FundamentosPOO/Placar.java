public class Placar {
    String time;
    String time2;
    int pontuacao = 0;
    int pontuacao2 = 0;

    public Placar () {
        this.time = "Corinthians";
        this.time2 = "São Paulo";
    }

    public Placar (String time, String time2) {
    this.time = time;
    this.time = time2;
    }

    public Placar (String time, String time2, int pontuacao, int pontuacao2) {
        this.time = time;
        this.time2 = time2;
        this.pontuacao = pontuacao;
        this.pontuacao2 = pontuacao2;
    }

    public void alterarTime (String novoTime) {
        time = novoTime;
    }
    public void alterarTime2 (String novoTime2) {
        time2 = novoTime2;
    }
    public void alterarPontuacao (int pontuacao) {
        this.pontuacao = pontuacao;
    } 
    public void alterarPontuacao2 (int pontuacao2) {
        this.pontuacao2 = pontuacao2;
    }

    void apresentar () {
    System.out.println("  Placar será  " + pontuacao + " " +  time + "  X  " + time2 + " " +  pontuacao2);
    }
}
