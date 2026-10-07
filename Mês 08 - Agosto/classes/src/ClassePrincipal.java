public class ClassePrincipal {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Honda", "Civic", "XXX11TT", 2010, 45000);
        Veiculo v2 = new Veiculo("Mazda","Mx3", "CCC74TTT",1997, 50000);
        Veiculo v3 = new Veiculo("Volkswagen", "Fusca","AAAAA444", 1998, 2000);

        Concessionaria c1 = new Concessionaria();

        c1.adicionarVeiculo(v1);
        c1.adicionarVeiculo(v2);

        System.out.println(c1.obterVeiculoMaisBarato());

        Concessionaria c2 = new Concessionaria();
        c2.adicionarVeiculo(v3);

        System.out.println(c2.obterVeiculoMaisBarato());
    }
}
