public class Carro {

    private double velocidade;

    public Carro(double velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "velocidade=" + velocidade +
                '}';
    }
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void acelerar(double valor) {
        if (valor >= 0 && valor < 20) {
            setVelocidade(velocidade + valor);
        } else {
            throw new IllegalArgumentException("Valor inválido para acelerar!");
        }
    }

    public void reduzir(double valor) {
        if (valor >= 0 && valor < 30) {
            setVelocidade(velocidade - valor);
        } else {
            throw new IllegalArgumentException("Valor inválido para reduzir!");
        }
    }
}
