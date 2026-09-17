import java.security.PublicKey;

public class Aeronave {

     String Modelo;
     Double Passageiro;
     double VelecidadeMax;
     double Combustivel;
     double QueimaCom;

    @Override
    public String toString() {
        return "Aeronave{" +
                "Modelo='" + Modelo + '\'' +
                ", Passageiro=" + Passageiro +
                ", VelecidadeMax=" + VelecidadeMax +
                ", Combustivel=" + Combustivel +
                ", QueimaCom=" + QueimaCom +
                '}';
    }

    public Aeronave(String modelo, Double passageiro, double velecidadeMax, double combustivel, double queimaCom) {
        Modelo = modelo;
        Passageiro = passageiro;
        VelecidadeMax = velecidadeMax;
        Combustivel = combustivel;
        QueimaCom = queimaCom;
    }
    public double TemporizadorDeAeronave(){
        return (Combustivel/QueimaCom);
    }
    public double CalcularMaioDistancia(){
        return (Combustivel/ QueimaCom)*VelecidadeMax;
    }
}

