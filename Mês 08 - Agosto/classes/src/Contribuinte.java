public class Contribuinte {
    private String nome;
    private String cpf;
    private String uf;
    private double rendaAnual;

    public Contribuinte(String nome, String CPF, String UF, double rendaAnual) {
        this.nome = nome;
        this.cpf = CPF;
        this.uf = UF;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
       if (nome == null || nome.isBlank()){
           System.out.println("Erro. Nome invalido");
       }else {
           nome = nome;
       }
    }
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.isBlank()){
            System.out.println("Erro. CPF invalido");
        }else {
        cpf = cpf;}
    }
    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        if (uf == null || uf.isBlank()){
            System.out.println("Erro. UF invalido");
        }else {
        uf = uf;}
    }
    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        if (rendaAnual <= 0){
            System.out.println("Erro. Renda invalido");
        }else {
            this.rendaAnual = rendaAnual;
        }
    }

    public double calcularAliquota() {

        if (rendaAnual <= 4000) {
            return 0;
        } else if (rendaAnual <= 9000) {
            return 0.058;
        } else if (rendaAnual <= 25000) {
            return 0.15;
        } else if (rendaAnual <= 35000) {
            return 0.275;
        } else {
            return 0.30;
        }
    }

    public double calcularImposto() {
        return rendaAnual * calcularAliquota();
    }

    public static Contribuinte quemPagaMais(Contribuinte[] a0) {

        Contribuinte maior = a0[0];

        for (int i = 1; i < a0.length; i++) {

            if (a0[i].calcularImposto() > maior.calcularImposto()) {
                maior = a0[i];
            }
        }

        return maior;
    }

    @Override
    public String toString() {
        return "Contribuinte{" +
                "Nome='" + nome + '\'' +
                ", CPF='" + cpf + '\'' +
                ", UF='" + uf + '\'' +
                ", RendaAnual=" + rendaAnual +
                '}';
    }
}

