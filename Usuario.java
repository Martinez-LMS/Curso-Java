import aula05.ControleRemoto;

public class Usuario {
    public static void main(String[] args) {
        // Criar uma instância de ControleRemoto
        ControleRemoto c = new ControleRemoto();

        // Chamar os métodos de ControleRemoto
        c.ligar();
        c.abrirMenu();
        c.maisVolume();
        c.ligarMudo();
        c.maisVolume();
        
    }
}
