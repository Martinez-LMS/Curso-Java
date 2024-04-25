package aula06;

public class Ringue {
    public static void main(String[] args) {

        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Pedro", "BR", 19, 1.86f, 87f, 23, 1, 0);
        l[1] = new Lutador("Joao", "PR", 29, 1.96f, 75f, 3, 1, 0);
        l[2] = new Lutador("maicon", "US", 45, 1.56f, 87f, 10, 1, 0);

        //l[1].setPeso(10);
        l[1].ganharLuta();
        l[1].apresentar();
    }

    
}
