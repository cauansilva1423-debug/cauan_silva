public class atv4 {
    public static void main(String[] args) {

        Materiais_Construcao produto = new Materiais_Construcao();
        Produto p1 = new Produto("havaianas", "praia",39.90,90);
        Produto p2 = new Produto("camiseta", "vestuario", 59.90, 50);
        Produto p3 = new Produto("mochila", "acessorios", 129.90, 20);
        Produto p4 = new Produto("tenis", "calcados", 249.90, 15);
        Produto p5 = new Produto("bone", "acessorios", 49.90, 35);

        produto.adicionarProduto(p1);
        produto.adicionarProduto(p2);
        produto.adicionarProduto(p3);
        produto.adicionarProduto(p4);
        produto.adicionarProduto(p5);

        p1.adicionarAoEstoque(20); 
        p2.venderProduto(10);

        System.out.println(produto.obterProdutoMaisCaro());

        System.out.println(produto.filtrarProduto( 90.00, 300.00) );

        System.out.println(p1);
    }
}
