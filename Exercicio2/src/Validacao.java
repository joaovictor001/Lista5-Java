public class Validacao {

    public String validarSalario(EntradaSaida salario){
        if (salario.getSalarioBruto() >500 && salario.getSalarioBruto() <30000 ){
            return "Valor entre 500 e 30000";

        }
        return "Valor não está entre 500 e 30000";

    }
}
