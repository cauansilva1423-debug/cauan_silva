public class Endereco {

    private String uf;
    private String cidade;
    private String cep;
    private String logradouro;
    private String numero;

    public Endereco(String uf, String cidade, String cep, String logradouro, String numero) {
        this.uf = uf;
        this.cidade = cidade;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        if (uf == null || uf.isBlank()){
            throw new IllegalArgumentException("Uf Invalido");
        }this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        if (cidade == null || cidade.isBlank()){
            throw new IllegalArgumentException("Cidade Invalido");
        }this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        if (cep == null || cep.isBlank()){
            throw new IllegalArgumentException("CEP Invalido");
        }this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        if (logradouro == null || logradouro.isBlank()){
            throw new IllegalArgumentException("Logradouro Invalido");
        }this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if (numero == null || numero.isBlank()){
            throw new IllegalArgumentException("Numero Invalido");
        }this.numero = numero;
    }
}