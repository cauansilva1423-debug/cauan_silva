public class atv5 {
    public static void main(String[] args) {

        Banco contas = new Banco();
        Conta c1 = new Conta("Cauan",50000.00);
        Conta c2 = new Conta("Uelison",500.00);
        Conta c3 = new Conta("Otavio",7000.00);
        Conta c4 = new Conta("Brunin",1600.00);
        Conta c5 = new Conta("Marcos",3000.00);
        Conta c6 = new Conta("Cainan",19000.00);
        Conta c7 = new Conta("Michael",1.00);

        contas.adicionarConta(c1);
        contas.adicionarConta(c2);
        contas.adicionarConta(c3);
        contas.adicionarConta(c4);
        contas.adicionarConta(c5);
        contas.adicionarConta(c6);
        contas.adicionarConta(c7);


        c1.transferir(c2,1500);
        c2.Sacar(200);

        System.out.println("Seu novo saldo é de: "+c7.Depositar(5000));
        System.out.printf("Sua simulação será de: %.2f%n", c5.simularInvestimento(1000, 12));
    }
}
