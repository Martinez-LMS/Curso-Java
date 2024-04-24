package aula01;

public class Ex01 {
    public static void main(String[] args) {
        
        Caneta caneta = new Caneta();

        caneta.cor = "Azul";
        caneta.ponta = 0.5f;
        caneta.modelo = "BIC";
        caneta.destampar();
        caneta.status();
        caneta.rabiscar();

        Caneta canetaMinha = new Caneta();
        canetaMinha.modelo = "Hostnet";
        canetaMinha.cor = "Preta";
        canetaMinha.tampar();
        canetaMinha.status();
        canetaMinha.rabiscar(); 

        
    }
}
