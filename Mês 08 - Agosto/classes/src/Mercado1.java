public class Mercado1 {

    public static void main(String[] args) {

        Mercado unidadeJoinville = new Mercado();
        unidadeJoinville.nomeMercado = "Giassi";
        unidadeJoinville.macasVendidas = 500;
        unidadeJoinville.precoMaca = 2;
        unidadeJoinville.laranjasVendidas = 400;
        unidadeJoinville.precoLaranja = 2.5;

        Mercado unidadeBlumenau = new Mercado();
        unidadeBlumenau.nomeMercado = "Angeloni";
        unidadeBlumenau.macasVendidas = 450;
        unidadeBlumenau.precoMaca = 1.8;
        unidadeBlumenau.laranjasVendidas = 420;
        unidadeBlumenau.precoLaranja = 2.2;

        Mercado unidadeFlorianopolis = new Mercado();
        unidadeFlorianopolis.nomeMercado = "Fort";
        unidadeFlorianopolis.macasVendidas = 500;
        unidadeFlorianopolis.precoMaca = 2;
        unidadeFlorianopolis.laranjasVendidas = 470;
        unidadeFlorianopolis.precoLaranja = 2.4;

        Mercado mercados[] = { unidadeBlumenau, unidadeFlorianopolis, unidadeJoinville };

        double maiorReceitaMacas = 0;

        Mercado mercadoMaiorReceitaMacas = null;

        for (int i = 0; i < mercados.length; i++) {

            if (mercados[i].calcularReceitaMacas() > maiorReceitaMacas) {

                maiorReceitaMacas = mercados[i].calcularReceitaMacas();

                mercadoMaiorReceitaMacas = mercados[i];
            }
        }

        System.out.println("Quem teve a maior receita de maçãs: " + mercadoMaiorReceitaMacas.nomeMercado + " faturou: "
                + mercadoMaiorReceitaMacas.calcularReceitaMacas());

        double menorReceitaLaranjas = Double.MAX_VALUE;

        Mercado mercadoMenorReceitaLaranjas = null;

        for (int i = 0; i < mercados.length; i++) {

            if (mercados[i].calcularReceitaLaranjas() < menorReceitaLaranjas) {

                menorReceitaLaranjas = mercados[i].calcularReceitaLaranjas();

                mercadoMenorReceitaLaranjas = mercados[i];
            }
        }

        System.out.println("Quem teve a menor receita de laranjas: " + mercadoMenorReceitaLaranjas.nomeMercado
                + " que vendeu R$" + mercadoMenorReceitaLaranjas.calcularReceitaLaranjas());


        double segundaMaiorReceitaTotal = 0;

        Mercado mercadoSegundaMaiorReceitaTotal = null;

        double maiorReceitaTotal = 0;

        for (int i = 0; i < mercados.length; i++) {

            if (mercados[i].calcularReceitaTotal() > maiorReceitaTotal) {

                maiorReceitaTotal = mercados[i].calcularReceitaTotal();
            }
        }

        for (int i = 0; i < mercados.length; i++) {

            if (mercados[i].calcularReceitaTotal() > segundaMaiorReceitaTotal
                    && mercados[i].calcularReceitaTotal() != maiorReceitaTotal) {

                segundaMaiorReceitaTotal = mercados[i].calcularReceitaTotal();

                mercadoSegundaMaiorReceitaTotal = mercados[i];
            }
        }

        System.out.println(
                "Mercado que teve a segunda maior receita total: " + mercadoSegundaMaiorReceitaTotal.nomeMercado);

        double receitaGeralMacas = 0;
        double receitaGeralLaranjas = 0;

        for (int i = 0; i < mercados.length; i++) {

            receitaGeralLaranjas += mercados[i].calcularReceitaLaranjas();
            
            receitaGeralMacas += mercados[i].calcularReceitaMacas();
        }

        if (receitaGeralMacas > receitaGeralLaranjas) {
            System.out.println("A franquia teve uma receita maior com maçãs");
        } else if (receitaGeralLaranjas > receitaGeralMacas) {
            System.out.println("A franquia teve uma receita maior com laranjas");
        } else {
            System.out.println("As receitas foram iguais");
        }
    }

}
