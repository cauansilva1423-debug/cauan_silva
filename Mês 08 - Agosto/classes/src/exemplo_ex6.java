public class exemplo_ex6 {

    public static void main(String[] args) {

        Exemplo unidadeJoinville = new Exemplo("Giassi",500,2,400,2.5);

        Exemplo unidadeBlumenau = new Exemplo("Angeloni",450,1.8,420,2.2);

        Exemplo unidadeFlorianopolis = new Exemplo ("Fort",500,2,470,2.4);

        Exemplo mercados[] = { unidadeBlumenau, unidadeFlorianopolis, unidadeJoinville };

        double maiorReceitaMacas = 0;

        Exemplo mercadoMaiorReceitaMacas = null;

        for (int i = 0; i < mercados.length; i++) {

            if (mercados[i].calcularReceitaMacas() > maiorReceitaMacas) {

                maiorReceitaMacas = mercados[i].calcularReceitaMacas();

                mercadoMaiorReceitaMacas = mercados[i];
            }
        }

        System.out.println("Quem teve a maior receita de maçãs: " + mercadoMaiorReceitaMacas.nomeMercado + " faturou: "
                + mercadoMaiorReceitaMacas.calcularReceitaMacas());

        double menorReceitaLaranjas = Double.MAX_VALUE;

        Exemplo mercadoMenorReceitaLaranjas = null;

        for (int i = 0; i < mercados.length; i++) {

            if (mercados[i].calcularReceitaLaranjas() < menorReceitaLaranjas) {

                menorReceitaLaranjas = mercados[i].calcularReceitaLaranjas();

                mercadoMenorReceitaLaranjas = mercados[i];
            }
        }

        System.out.println("Quem teve a menor receita de laranjas: " + mercadoMenorReceitaLaranjas.nomeMercado
                + " que vendeu R$" + mercadoMenorReceitaLaranjas.calcularReceitaLaranjas());


        double segundaMaiorReceitaTotal = 0;

        Exemplo mercadoSegundaMaiorReceitaTotal = null;

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
