package aula04;

public class ExBanco {
    public static void main(String[] args) {
        // Criar uma instância de ContaBanco
        ContaBanco minhaConta = new ContaBanco(12345, "CC", "João Silva");
        

        // Exibir informações da conta
        System.out.println("---------------------------------------------");
        System.out.println("Informações da Conta:");
        minhaConta.depositar(100);
        System.out.println("Número da Conta: " + minhaConta.getNumConta());
        System.out.println("Tipo da Conta: " + minhaConta.getTipo());
        System.out.println("Dono da Conta: " + minhaConta.getDono());
        System.out.println("Saldo: R$" + minhaConta.getSaldo());
        System.out.println("Status da Conta: " + (minhaConta.isStatus() ? "Aberta" : "Fechada"));
        
        System.out.println("---------------------------------------------");
        ContaBanco suaConta = new ContaBanco(333333, "CP", "Maria");
        suaConta.depositar(300);
        System.out.println("Informações da Conta:");
        System.out.println("Número da Conta: " + suaConta.getNumConta());
        System.out.println("Tipo da Conta: " + suaConta.getTipo());
        System.out.println("Dono da Conta: " + suaConta.getDono());
        System.out.println("Saldo: R$" + suaConta.getSaldo());
        suaConta.sacar(30);
        System.out.println("Status da Conta: " + (suaConta.isStatus() ? "Aberta" : "Fechada"));
        System.out.println("---------------------------------------------");
        

        
    }
}
