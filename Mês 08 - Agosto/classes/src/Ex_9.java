public class Ex_9 {
    public class Main {
        public static void main(String[] args) {

            Carro carro1 = new Carro(50);
            Carro carro2 = new Carro(80);
            Carro carro3 = new Carro(100);


            System.out.println("Carro 1: " + carro1.getVelocidade() + " km/h");
            System.out.println("Carro 2: " + carro2.getVelocidade() + " km/h");
            System.out.println("Carro 3: " + carro3.getVelocidade() + " km/h");
        }
    }
}
