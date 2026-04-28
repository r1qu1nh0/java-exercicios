public class app {
    public static void main(String[] args) {
        professor professor = new professor("Emerson", 2400);

        professor.getNome();
        professor.getSalario();

        System.out.println(professor.getDados());
        System.out.println(professor.getSalario());
    }
}
