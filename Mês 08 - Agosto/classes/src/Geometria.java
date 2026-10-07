import java.util.ArrayList;
import java.util.List;
public class Geometria {

    private List<Retangulo> retangulo;

    public Geometria(){
        retangulo = new ArrayList<Retangulo>();
    }

    public void adicionarRetangulo(Retangulo r){
        retangulo.add(r);
    }

    public Retangulo obterMaiorArea(){
        Double maiorArea = Double.MIN_VALUE;
        Retangulo RetanguloMaiorArea = null;

        for (Retangulo r : retangulo) {
            if (r.DescobrirArea() > maiorArea){
                maiorArea = r.DescobrirArea();
                RetanguloMaiorArea = r;
            }
        }return RetanguloMaiorArea;
    }

    public Retangulo obterMaiorPerimetro(){
        double maiorPerimetro = Double.MIN_VALUE;
        Retangulo RetanguloMaiorPerimetro = null;

        for (Retangulo r : retangulo){
            if (r.DescobrirPerimetro() > maiorPerimetro){
                maiorPerimetro = r.DescobrirPerimetro();
                RetanguloMaiorPerimetro = r;
            }
        }return RetanguloMaiorPerimetro;
    }
}