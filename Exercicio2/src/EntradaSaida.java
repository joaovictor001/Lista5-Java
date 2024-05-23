import java.util.Locale;
import java.util.Scanner;

public class EntradaSaida {
   public static void inputs(){
       Scanner sc = new Scanner(System.in);
       Locale.setDefault(Locale.US);

       System.out.print("Informe seu salario bruto para calcular os descontos: ");
       double salarioBruto = sc.nextDouble();
       System.out.println(Validacao.validarSalario(salarioBruto));
       
       System.out.print("Horas Trabalhadas: ");
       double horaTrabalhadas = sc.nextDouble();


       

       double inss = Calculo.descontoInss(salarioBruto);
       double irpf = Calculo.descontoIrpf(salarioBruto);
       double planoDeSaude = Calculo.descontoPlanoDeSaude(salarioBruto);
       double horaExtra = Calculo.horasExtras(horaTrabalhadas,salarioBruto);
       System.out.println("Valor de horas extras a pagar: "+ horaExtra);

       System.out.println("Salario liquido: "+ Calculo.salarioLiquido(salarioBruto,inss,irpf,planoDeSaude,horaExtra));
   }

}
