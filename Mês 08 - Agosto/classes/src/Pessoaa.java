import java.time.LocalDate;


public class Pessoaa {


    private String nome;
    private LocalDate dataNascimento;



    public Pessoaa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }



    // Getters
    public String getNome() {
        return nome;
    }


    public LocalDate getDataNascimento() {
        return dataNascimento;
    }



    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }



// ToString

    @Override
    public String toString() {
        return "Nome: " + nome + " | Data de nascimento: " + dataNascimento;
    }
}
