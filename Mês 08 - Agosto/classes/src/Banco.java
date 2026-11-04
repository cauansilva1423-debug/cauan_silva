import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Conta> contas;

    public Banco(){
        contas = new ArrayList<Conta>();
    }

    public void adicionarConta(Conta c){
        contas.add(c);
    }


}
