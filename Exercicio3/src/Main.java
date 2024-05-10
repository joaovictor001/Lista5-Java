
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fatura [ ] faturas= new Fatura[24];
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a nome do fiador do emprestimo: ");
        String nome = sc.nextLine();
        System.out.print("Salario do fiador: ");
        double salario = sc.nextDouble();

        System.out.print("Qual o valor do emprestimo: ");
        double valorImprestimo = sc.nextDouble();
        

        Emprestimo emprestimo = new Emprestimo(nome,valorImprestimo);
        double emprestimoJurosAplicado = emprestimo.calculoJuros();
        double parcela = emprestimo.parcela(emprestimoJurosAplicado);

        
        if (!emprestimo.validarEmprestimo(emprestimoJurosAplicado,parcela,salario)){
            System.out.println("Emprestimo utrapassou o valor limite!!!");
            return;
        }
        System.out.println("Emprestimo aprovado!");

        for (int i =0; i < 23; ++i){
            faturas[i] = (new Fatura(parcela,emprestimoJurosAplicado));
        }

        System.out.println("FATURAS:");
        for (int i =0; i < 23; ++i){
            System.out.println("Mês: "+(i+1)+" "+faturas[i]);
        }





        

        
        




        

    }
}