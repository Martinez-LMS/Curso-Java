package aula01;

public class Caneta {
    public String modelo;
    public String cor;
    public float ponta;
    public int carga;
    public boolean tampada;

    public void status(){
        System.out.print("modelo: " + this.modelo);
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
