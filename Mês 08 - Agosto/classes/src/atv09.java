import java.time.LocalDate;


public class atv09 {


    public static void main(String[] args) {


        Familia familia = new Familia();



// Criando pessoas
        Pessoaa p1 = new Pessoaa("Carlos", LocalDate.of(1970, 5, 10));
        Pessoaa p2 = new Pessoaa("Ana", LocalDate.of(1985, 8, 20));
        Pessoaa p3 = new Pessoaa("Joao", LocalDate.of(1995, 3, 15));



// Adicionando pessoas
        familia.adicionarPessoa(p1);
        familia.adicionarPessoa(p2);
        familia.adicionarPessoa(p3);



// Encontrando a pessoa mais velha
        Pessoaa maisVelha = familia.encontrarPessoaMaisVelha();


        System.out.println("Pessoa mais velha da familia:");
        System.out.println(maisVelha);
    }
}
