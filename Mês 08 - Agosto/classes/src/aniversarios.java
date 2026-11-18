import java.util.ArrayList;
import java.util.List;

public class aniversarios {

    private List<Maior_idade> maior;

    public aniversarios() {
        maior = new ArrayList<Maior_idade>();
    }
    public void adicionarPessoas(Maior_idade m) {
        maior.add(m);
    }
}
