public class Ex_8 {
    public static void main(String[] args) {


        Contribuinte a1 = new Contribuinte("Wendel", "12883014990", "PR", 30000);
        Contribuinte a2 = new Contribuinte("Carla", "06301663900", "SC", 15000);
        Contribuinte a3 = new Contribuinte("Cauan", "12883014990", "SC", 40000);
        Contribuinte a4 = new Contribuinte("Cainan", "12883081600", "PR", 67000);
        Contribuinte a5 = new Contribuinte("Marcos", "12345678910", "RS", 75000);

        Contribuinte a0[] = {a1, a2, a3, a4, a5};
        Contribuinte maior = Contribuinte.quemPagaMais(a0);

        System.out.println("Quem mais paga imposto: " + maior.getNome());
        System.out.println("Imposto: R$ " + maior.calcularImposto());

    }
}
