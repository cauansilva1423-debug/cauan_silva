public class ClassePrincipal_Usuario {
    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        Usuario u2 = new Usuario();

        u1.nome = "Cauan";
        u1.sexo = 'M';
        u1.nascimento = "23/01/2009";
        u1.estadoCivil = "Casado";

        u2.nome = "yasmin";
        u2.sexo = 'F';
        u2.nascimento = "28/02/2010";
        u2.estadoCivil = "Casada";

        System.out.println(u1.nome +" "+ u1.sexo +" " +u1.nascimento +" " +u1.estadoCivil);
        System.out.println(u2.nome +" "+ u2.sexo +" " +u2.nascimento +" " +u2.estadoCivil);




    }
}
