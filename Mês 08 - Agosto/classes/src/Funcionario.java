public class Funcionario {
    String Identificacao;
    String Nome;
    String Sobrenome;
    double Salario;
    double Percentual;

    public double obterSalarioAnual(){
        return (Salario * 12);
    }
    public String juntarNomes(){
        return (Nome + Sobrenome);
    }
    public double modificarSalario(){
        return Salario + (Salario * Percentual)/100;
    }
}
