public class ClassePrincipal_Perimetro {
    public static void main(String[] args) {
        Perimetro p1 = new Perimetro();

        p1.altura = 8;
        p1.largura = 4;

        Perimetro p2 = new Perimetro();

        p2.altura = 8;
        p2.largura = 4;

        System.out.println(p2.obterPerimetro());


    }
}
