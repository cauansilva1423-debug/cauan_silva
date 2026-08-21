import java.util.Scanner;

public class casa_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("informe uma Palavra: ");
        String palavra = sc.nextLine();
        System.out.println(identificarPar(palavra));

    }
    public static char identificarPar(String palavra){
        if (palavra.length() % 2 == 0) {
            // Se o tamanho for par
            return palavra.charAt(0);
        } else {
            // Se o tamanho for ímpar
            return palavra.charAt(1);
        }

    }

}
