import java.util.ArrayList;


public class Familia {


    private ArrayList<Pessoaa> listaPessoas;



    // Construtor
    public Familia() {
        listaPessoas = new ArrayList<>();
    }



    // Adicionar pessoa
    public void adicionarPessoa(Pessoaa pessoaa) {
        listaPessoas.add(pessoaa);
    }



    // Encontrar pessoa mais velha
    public Pessoaa encontrarPessoaMaisVelha() {


        if (listaPessoas.isEmpty()) {
            return null;
        }


        Pessoaa maisVelha = listaPessoas.get(0);


        for (Pessoaa pessoaa : listaPessoas) {


            if (pessoaa.getDataNascimento().isBefore(maisVelha.getDataNascimento())) {
                maisVelha = pessoaa;
            }
        }


        return maisVelha;
    }
}
