public class Ex2 {

    public static void main(String[] args) {
        Mercado unidadeJoinville = new Mercado();


        unidadeJoinville.nomeMercado = "Giassi";
        unidadeJoinville.macasVendidas = 700;
        unidadeJoinville.precoMaca = 2;
        unidadeJoinville.laranjasVendidas = 100;
        unidadeJoinville.precoLaranja = 2.5;


        Mercado unidadeBlumenau = new Mercado();


        unidadeBlumenau.nomeMercado = "Angeloni";
        unidadeBlumenau.macasVendidas = 250;
        unidadeBlumenau.precoMaca = 2;
        unidadeBlumenau.laranjasVendidas = 320;
        unidadeBlumenau.precoLaranja = 2.7;

        Mercado unidadeFlorianopolis = new Mercado();

        unidadeFlorianopolis.nomeMercado = "Fort";
        unidadeFlorianopolis.macasVendidas = 350;
        unidadeFlorianopolis.precoMaca = 3;
        unidadeFlorianopolis.laranjasVendidas = 520;
        unidadeFlorianopolis.precoLaranja = 2.5;

        System.out.println(unidadeBlumenau.nomeMercado + " vendeu " + unidadeBlumenau.macasVendidas + " maçãs a R$"
                + unidadeBlumenau.precoMaca);
    }
}
