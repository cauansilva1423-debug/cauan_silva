public class Produto {
    private String marca;
    private String modelo;
    private double preço;
    private int quantidadeEstoque;

    public Produto (String marca, String modelo, double preço, int quantidadeEstoque) {
        this.marca = marca;
        this.modelo = modelo;
        this.preço = preço;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.isBlank()){
            throw new IllegalArgumentException("Marca Invalido");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()){
            throw new IllegalArgumentException("Modelo Invalido");
        }
        this.modelo = modelo;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        if (preço < 0){
            throw new IllegalArgumentException("Preço Invalida");}
        this.preço = preço;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque < 0){
            throw new IllegalArgumentException("Quantidade Invalida");}
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void adicionarAoEstoque(int q){
        quantidadeEstoque += q;
    }

    public Boolean venderProduto(int v){
        if (v< quantidadeEstoque || v <=0){
            return false;
        }else {
            quantidadeEstoque -=v;
            return true;
        }
    }

    @Override
    public String toString() {
        return
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", preço=" + preço +
                ", quantidadeEstoque=" + quantidadeEstoque +
                '}'+"\n";
    }
}
