import java.util.Locale;
import java.util.Scanner;

public class EntradaSaida {
    static Validacao validar = new Validacao();
    public static void operacao(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe qual a conta que deseja fazer: (1-Media Aritimetica 2-Media Ponderada)");
        int escolha = sc.nextInt();
        double n1 = EntradaSaida.nota1();
        double n2 = EntradaSaida.nota1();
        if (escolha == 1){
            double result = Calculo.MediaAritimetica(n1, n2);
            Resultado.result(result);

        }else {
            double p1 = EntradaSaida.peso1();
            double p2 = EntradaSaida.peso2();
            double result = Calculo.MediaPonderada(n1, n2, p1, p2);
            Resultado.result(result);
        }
    }
    public static Double nota1 () {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        while (true) {
            System.out.print("Informe a nota 1:");
            double n1 = sc.nextDouble();
            if (!validar.validar(n1)) {
                System.out.println("Nota invalida!!!");
                continue;
            }
            return n1;

        }
    }
    public static Double nota2() {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        while (true) {
            System.out.print("Informe a nota 2:");
            double n2 = sc.nextDouble();
            if(!validar.validar(n2)){
                System.out.println("Nota invalida!!!");
                continue;
            }
            return n2;
        }
    }
    public static Double peso1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o peso 1:");
        Double p1 = sc.nextDouble();
        return p1;
        }
    public static Double peso2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o peso 2:");
        Double p2 = sc.nextDouble();
        return p2;
    }

}



