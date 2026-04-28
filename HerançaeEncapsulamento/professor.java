public class professor extends pessoa {
    private double salario;

    public professor (String nome, double salario) {
        super (nome);
        this.salario = salario; 
    }
    
    public double getSalario() {
        return salario;
}

    public String getDados() {
        return super.getDados() + " " + salario;
    }
}
