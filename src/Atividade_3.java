public class Atividade_3 {

    public static void main(String[] args) {

        int[] vetor = new int[2];
        vetor[0] = 5;
        vetor[1] = 10;

        int temp = vetor[0];
        vetor[0] = vetor[1];
        vetor[1] = temp;
        System.out.println("Posição 0: " + vetor[0]);
        System.out.println("Posição 1: " + vetor[1]);


    }
}
