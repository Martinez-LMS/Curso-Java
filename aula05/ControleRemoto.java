package aula05;

public class ControleRemoto implements Controlador {
    // Atributos privados
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Construtor
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    // Métodos de acesso (getters e setters)
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    // Implementações dos métodos da interface Controlador

    @Override
    public void ligar() {
        this.setLigado(true);
        System.out.println("Controle remoto ligado.");
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        System.out.println("Controle remoto desligado.");
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Está tocando? " + this.isTocando());
        System.out.println("Volume: " + this.getVolume());

        System.out.println("Volume:");
        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.println("^");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu.");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado() && this.getVolume() < 100) {
            this.setVolume(this.getVolume() + 5);
            System.out.println("Aumentando volume para: " + this.getVolume());
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(this.getVolume() - 5);
            System.out.println("Diminuindo volume para: " + this.getVolume());
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
            System.out.println("Mudo ativado.");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
            System.out.println("Mudo desativado. Volume definido para 50.");
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !this.isTocando()) {
            this.setTocando(true);
            System.out.println("Reprodução iniciada.");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()) {
            this.setTocando(false);
            System.out.println("Reprodução pausada.");
        }
    }
}
