public class atv6 {

    public static void main(String[] args) {

            Endereco endereco = new Endereco("SC", "Blumenau", "89010-000", "Rua XV de Novembro", "100");

            Pessoa pessoa = new Pessoa("João", endereco);

            pessoa.exibirDados();
    }
}
