import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Informe seu salario bruto para calcular os descontos: ");
        double salarioBruto = sc.nextDouble();
        System.out.print("Horas Trabalhadas: ");
        double horaTrabalhadas = sc.nextDouble();

        EntradaSaida entradaSaida = new EntradaSaida(salarioBruto);
        Calculo calculo = new Calculo();

        double inss = calculo.descontoInss(salarioBruto);
        double irpf = calculo.descontoIrpf(salarioBruto);
        double planoDeSaude = calculo.descontoPlanoDeSaude(salarioBruto);
        double horaExtra = calculo.horasExtras(horaTrabalhadas,salarioBruto);

        System.out.println(calculo.salarioLiquido(salarioBruto,inss,irpf,planoDeSaude,horaExtra));




    }
}