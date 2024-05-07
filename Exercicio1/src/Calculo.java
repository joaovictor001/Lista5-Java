public class Calculo {
    public double MediaAritimetica(EntradaSaida notas){
        return (notas.getN1()+notas.getN2())/2;
    }
    public  double MediaPonderada(EntradaSaida notas){
        return  (notas.getP1()* notas.getN1())+(notas.getP2()* notas.getN2())/(notas.getP1()+ notas.getP2());
    }
}
