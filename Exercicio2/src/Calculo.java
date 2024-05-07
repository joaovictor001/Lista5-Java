public class Calculo {
    private Double descontoInss(double salario){
        salario = salario * 0.20;
        return salario;

    }
    private Double descontoIrpf(double salario){
        salario = salario * 0.10;
        return salario;

    }
    private Double descontoPlanoDeSaude(double salario){
        salario = salario * 0.05;
        return salario;

    }
    public Double horasExtras(double horas,double salarioBruto){
        return 0.0;



    }
    public double salarioLiquido(double salario, double inss,double irpf,double plano,double horaExtra){

        salario = salario -inss -irpf -plano + horaExtra;
        EntradaSaida salario_liquido = new EntradaSaida();
        salario_liquido.setSalarioLiquido(salario);
        return salario;

    }
}
