public class Flor {

    private String nome;
    private double preco;
    private String cliente;

    public Flor(String nome, double preco, String cliente) {
        this.nome = nome;
        this.preco = preco;
        this.cliente = cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Flor{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", cliente='" + cliente + '\'' +
                '}';
    }
}
