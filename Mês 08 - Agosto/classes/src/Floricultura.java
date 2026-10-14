import java.util.ArrayList;
import java.util.List;

public class Floricultura {

    private List<Flor> flor;

    public Floricultura(){
       flor = new ArrayList<Flor>();
    }

    public void adicionarFlor(Flor f){
        flor.add(f);
    }

    public List<Flor> obterListaCliente(String nome) {
        List<Flor> floresPorCliente = new ArrayList<>();

        for (Flor l : flor) {
            if (l.getCliente().equals(nome)) {
                floresPorCliente.add(l);
            }
        }
        return floresPorCliente;

    }



}
