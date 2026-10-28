import java.util.ArrayList;
import java.util.List;
public class Materiais_Construcao {

    private List<Produto> produtos;

    public Materiais_Construcao() {
        produtos = new ArrayList<Produto>();
    }
    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }
    public Produto obterProdutoMaisCaro(){
       Produto maior = produtos.get(0);
        for (Produto p : produtos){
            if (p.getPreço() > maior.getPreço()){
                maior = p;
            }
        }return maior;
    }

    public List<Produto> filtrarProduto ( double precoMin, double precoMax) {
        List<Produto> pesquisa = new ArrayList<>();

        for (Produto p : produtos) {
            if ( p.getPreço() >= precoMin && p.getPreço() <= precoMax) {
               pesquisa.add(p);
            }
        }return pesquisa;
    }

    @Override
    public String toString() {
        return "Materiais_Construcao{" +
                "produtos=" + produtos +
                '}';
    }
}
