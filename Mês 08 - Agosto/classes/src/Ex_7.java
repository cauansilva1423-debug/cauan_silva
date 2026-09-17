public class Ex_7 {
    public static void main(String[] args) {

        Aeronave A001 = new Aeronave("AAA", 25.0, 300.0,350,0.3);
        Aeronave A002 = new Aeronave("BBB", 22.0,450.0,450,0.5);
        Aeronave A003 = new Aeronave("CCC", 20.0,550.0, 650,0.4);
        Aeronave A004 = new Aeronave("DDD", 40.0, 500.0, 500, 0.8);

        Aeronave A000[] = {A001, A002, A003,A004};





        Double DistaciaAR= 0.0;
        double TempoAR = 0.0;
        double MaisPassageiros = 0.0;
        Aeronave AeronaveMaisPassageiros = null;
        Aeronave AeronaveTempoAR= null;
        Aeronave AeronaveDistanciaAR = null;

        for (int i =0; i < A000.length;i++){
            if (A000[i].Passageiro > MaisPassageiros){
                MaisPassageiros = A000[i].Passageiro;
                AeronaveMaisPassageiros = A000[i];
            }
            if (A000[i].TemporizadorDeAeronave() >TempoAR ){
                TempoAR = A000[i].TemporizadorDeAeronave();
                AeronaveTempoAR = A000[i];
            }
            if (A000[i].CalcularMaioDistancia() > DistaciaAR){
                DistaciaAR = A000[i].CalcularMaioDistancia();
                AeronaveDistanciaAR = A000[i];
            }
        }
        System.out.println("A) "+ AeronaveMaisPassageiros);
        System.out.println("B) "+ AeronaveTempoAR);
        System.out.println("C) "+ AeronaveDistanciaAR);
    }
}
