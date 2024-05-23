public class Calculo {

    public static double MediaAritimetica( double n1,double n2){
        return (n1+n2)/2;
    }
    public static double MediaPonderada(double n1,double n2, double p1,double p2){
        return  (p1*n1)+(p2*n2)/(p1+ p2);
    }
}
