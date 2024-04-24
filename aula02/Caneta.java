package aula02;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status(){
        System.out.print("modelo: " + this.modelo);
        System.out.println("COR: " + this.cor);
        System.out.println("CARGA: " + this.carga);
        System.out.println("esta tampada?" + this.tampada);
    }

    public void rabiscar(){

        if (this.tampada == true) {
            
            System.out.println("[ERRO] nao pode rabiscar");
        }else{
            System.out.println("Estou rabiscando");
        }

    }

    public void tampar(){

        this.tampada = true;

    }

    public void destampar(){

        this.tampada = false;
    }
}
