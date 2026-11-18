import java.time.LocalDate;
import java.time.Period;

public class Maior_idade {
    private String nome;
    private LocalDate dataNascimento;

    public Maior_idade(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    LocalDate hoje = LocalDate.now();

    public void maiorIdade(LocalDate datee){
        int idadeCauan = Period.between(datee,  hoje).getYears();

        if (idadeCauan >= 18){
            System.out.println("Cauan é de maior");
        }else {
            System.out.println("Cauan é de menor");
        }
    }

}
