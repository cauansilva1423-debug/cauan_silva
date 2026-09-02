public class Ex5 {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.Identificacao = "08546";
        f1.Nome = "Cauan";
        f1.Sobrenome =" Silva";
        f1.Salario = 2000;
        f1.Percentual = 10;

        System.out.println(f1.juntarNomes() + " da identificaçao "+ f1.Identificacao + " Terá recebido R$"+ f1.obterSalarioAnual() + " Em um ano, E seu salario aumentará para R$" + f1.modificarSalario() + " De acordo com seu percentual de aumento");
    }
}
