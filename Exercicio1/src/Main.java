import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Validacao validar = new Validacao();
        Calculo calcular = new Calculo();
        Resultado resultado = new Resultado();



        while (true){
            System.out.print("Informe a nota 1:");
            Double n1 = sc.nextDouble();
            if(!validar.validar(n1)){
                System.out.println("Nota invalida!!!");
                continue;
            }
            System.out.print("Informe a nota 2:");
            Double n2 = sc.nextDouble();
            validar.validar(n1);
            if(!validar.validar(n2)){
                System.out.println("Nota invalida!!!");
                continue;
            }
            System.out.print("Informe o peso 1:");
            Double p1 = sc.nextDouble();
            System.out.print("Informe o peso 1:");
            Double p2 = sc.nextDouble();

            EntradaSaida inputs = new EntradaSaida(n1,n2,p1,p2);

            System.out.println(resultado.result(calcular.MediaAritimetica(inputs)));
            System.out.println(resultado.result(calcular.MediaAritimetica(inputs)));






        }
    }
}