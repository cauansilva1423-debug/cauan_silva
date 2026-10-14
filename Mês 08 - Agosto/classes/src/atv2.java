public class atv2 {
    public static void main(String[] args) {

        Flor a1 = new Flor("Rosa", 20,"Yamin");
        Flor a2 = new Flor("Lírios", 25,"Yamin");
        Flor a3 = new Flor("Girassol", 15,"Flaviane");
        Flor a4 = new Flor("XXX", 10,"Flaviane");
        Flor a5 = new Flor("AAA", 15,"Cauan");

        Floricultura f1 = new Floricultura();

        f1.adicionarFlor(a1); f1.adicionarFlor(a2); f1.adicionarFlor(a3); f1.adicionarFlor(a4); f1.adicionarFlor(a5);


        System.out.println(f1.obterListaCliente("Flaviane"));

    }
}
