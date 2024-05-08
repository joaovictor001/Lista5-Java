public class Calculo {
    public Double descontoInss(double salario){
        salario = salario * 0.20;
        return salario;

    }
    public Double descontoIrpf(double salario){
        salario = salario * 0.10;
        return salario;
    }
    public Double descontoPlanoDeSaude(double salario){
        salario = salario * 0.05;
        return salario;
    }
    public Double horasExtras(double horas,double salarioBruto){
        if (horas > 160){
            double horasAmais = horas -160;
            return horasAmais * (salarioBruto/2);
        }return  0.0;
//        double valorHora = salarioBruto /160;
//        double horasPagar = 160  -  horas;
//        double descontoHoras =  horasPagar * valorHora;
//        System.out.println("Está devendo: " +horasPagar+" horas");
//        return descontoHoras;



    }
    public double salarioLiquido(double salario, double inss,double irpf,double plano,double horaExtra){

        salario = salario -inss -irpf -plano + horaExtra;
        return salario;

    }


}
