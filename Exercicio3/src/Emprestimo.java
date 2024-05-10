public class Emprestimo {
    private String fiador;
    private Double valorEmprestimo;
    private static double limiteEmprestimo = 200000;

    public Emprestimo(String fiador, Double valorEmprestimo) {
        this.fiador = fiador;
        this.valorEmprestimo = valorEmprestimo;
    }

    public double calculoJuros (){
        double juros = valorEmprestimo * 0.35;
        return valorEmprestimo + juros;
    }
    public double parcela(double valorTotal){
        return valorTotal / 24;
    }
    public Boolean validarEmprestimo(double totalEmprestimo,double parcela,double salario){
        if(totalEmprestimo< limiteEmprestimo){
            return parcela <= salario * 0.15;
        }return  false;
    }


}
