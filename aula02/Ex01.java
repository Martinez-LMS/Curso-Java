package aula02;

public class Ex01 {
    public static void main(String[] args) {
        
        Caneta caneta = new Caneta();

        caneta.modelo = "BIC cristal";
        caneta.cor = "Azul";
        //caneta.ponta = 0.6f;
        caneta.carga = 80;
        //caneta.tampada = true;
        caneta.destampar();
        caneta.status();
        
    }
}
