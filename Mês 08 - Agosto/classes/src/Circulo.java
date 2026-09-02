public class Circulo {
    double Raio;

    public Circulo(double raio) {
        this.Raio = raio;
    }
    public double obterPI(){
        return (Math.PI*Raio*Raio);
    }
}
