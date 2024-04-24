package aula04;

public class ContaBanco {
    // Atributos
    private int numConta;
    private String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // Construtor
    public ContaBanco(int numConta, String tipo, String dono) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = tipo.equals("CC") ? 50 : tipo.equals("CP") ? 150 : 0;
        this.status = true;
    }

    // Métodos

    // Método para abrir uma conta
    public void abrirConta(String tipo) {
        if (this.status) {
            System.out.println("Conta já está aberta");
            return;
        }
        this.tipo = tipo;
        this.status = true;
        this.saldo = tipo.equals("CC") ? 50 : tipo.equals("CP") ? 150 : 0;
    }

    // Método para fechar uma conta
    public void fecharConta() {
        if (saldo > 0) {
            System.out.println("Conta com saldo não pode ser fechada");
        } else if (saldo < 0) {
            System.out.println("Conta em débito não pode ser fechada");
        } else {
            this.status = false;
        }
    }

    // Método para realizar um depósito
    public void depositar(float valor) {
        if (status) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Não é possível depositar: conta está fechada");
        }
    }

    // Método para realizar um saque
    public void sacar(float valor) {
        if (status) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Não é possível sacar: conta está fechada");
        }
    }

    // Método para pagar a mensalidade
    public void pagarMensal() {
        float valorMensalidade = tipo.equals("CC") ? 12 : tipo.equals("CP") ? 20 : 0;
        
        if (!status) {
            System.out.println("Conta está fechada");
            return;
        }

        if (saldo >= valorMensalidade) {
            saldo -= valorMensalidade;
            System.out.println("Mensalidade de R$" + valorMensalidade + " paga com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para pagar a mensalidade");
        }
    }

    // Getters e Setters

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
