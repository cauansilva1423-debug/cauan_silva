public class atv1 {
    public static void main(String[] args) {

        Retangulo r1 = new Retangulo(10.0,8.0);
        Retangulo r2 = new Retangulo(16.0, 5.0);
        Retangulo r3 = new Retangulo(25.0,12.0);
        Retangulo r4 = new Retangulo(23.0, 2.0);

        Geometria g1 = new Geometria();

        g1.adicionarRetangulo(r1);
        g1.adicionarRetangulo(r2);

        System.out.println(g1.obterMaiorArea());
        System.out.println(g1.obterMaiorPerimetro());

        Geometria g2 = new Geometria();

        g2.adicionarRetangulo(r3);
        g2.adicionarRetangulo(r4);

        System.out.println(g2.obterMaiorArea());
        System.out.println(g2.obterMaiorPerimetro());
        System.out.println(r1.DescobrirArea());
        System.out.println(r3.DescobrirPerimetro());
    }
}
