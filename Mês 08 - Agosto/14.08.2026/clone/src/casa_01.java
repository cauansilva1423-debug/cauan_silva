public class casa_01 {

    // a) Maior elemento
    public static int maior(int[] vetor) {
        int maior = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        return maior;
    }

    // b) Menor elemento
    public static int menor(int[] vetor) {
        int menor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        return menor;
    }

    // c) Média dos valores
    public static double media(int[] vetor) {
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        return (double) soma / vetor.length;
    }

    public static void main(String[] args) {

        int[] vetor = {10, 35, 38, 28, 27};

        System.out.println("Maior: " + maior(vetor));
        System.out.println("Menor: " + menor(vetor));
        System.out.println("Média: " + media(vetor));
    }
}
