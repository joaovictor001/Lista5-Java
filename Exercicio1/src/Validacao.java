public class Validacao {

    public Boolean validar(double nota){
        if(nota>0 && nota<10){
            return true;
        }
        return false;
    }
}
