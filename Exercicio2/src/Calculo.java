public class Calculo {
    public static Double descontoInss(double salario){
        salario = salario * 0.20;
        return salario;

    }
    public static Double descontoIrpf(double salario){
        salario = salario * 0.10;
        return salario;
    }
    public static  Double descontoPlanoDeSaude(double salario){
        salario = salario * 0.05;
        return salario;
    }
    public static Double horasExtras(double horas,double salarioBruto){
        double valorHoraExtra = salarioBruto / 160;
        if (horas > 160){
            double horasAmais = horas -160;
            return (valorHoraExtra + (valorHoraExtra /2))* horasAmais;
        }return  0.0;
    }
    public static double salarioLiquido(double salario, double inss,double irpf,double plano,double horaExtra){

        salario = salario -inss -irpf -plano + horaExtra;
        return salario;

    }


}
