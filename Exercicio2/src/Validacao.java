public class Validacao {

    public static String validarSalario( double salario){
        if (salario >500 && salario<30000 ){
            return "Valor entre 500 e 30000";
        }
        return "Valor não está entre 500 e 30000";

    }
}
