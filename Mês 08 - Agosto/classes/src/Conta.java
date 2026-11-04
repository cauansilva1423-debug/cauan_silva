public class Conta {
    private String nomeTitular;
    private Double saldo;

    public Conta(String nomeTitular, Double saldo) {
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        if (nomeTitular == null || nomeTitular.isBlank()){
            throw new IllegalArgumentException("Nome Invalido");
        }
        this.nomeTitular = nomeTitular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        if (saldo < 0){
            throw new IllegalArgumentException("Preço Invalida");}
        this.saldo = saldo;
    }

    public double Sacar (double s){
        if (s > saldo || s <= 0){
           throw new IllegalArgumentException("Saque Invalido");
        }
        double novosaldo = saldo - s;
        System.out.println("Seu novo saldo é: "+ novosaldo );
        return novosaldo;
    }

    public  double Depositar (double d){
        if (d <=0){
            throw new IllegalArgumentException("Deposito Invalido");
        }
        double newsaldo = saldo + d;
        return newsaldo;
    }

    public void transferir (Conta contaDestino, double t){
        if (t> 0 && saldo >= t){
            saldo -= t;
            contaDestino.Depositar(t);
        }
    }

    public double simularInvestimento (double i, int t){
        double investimento = i * Math.pow(1 + 0.01, t);
        return investimento;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nomeTitular='" + nomeTitular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}

