import java.sql.SQLOutput;
import java.util.Scanner;

public class Atividade_5 {
    public static void main(String[] args) {

        String[] nome = new String[3];

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome 1: ");
        nome[0] = sc.nextLine();
        System.out.println("Digite o nome 2: ");
        nome[1] = sc.nextLine();
        System.out.println("Digite o nome 3: ");
        nome[2] = sc.nextLine();

        sc.close();

        System.out.println("Nome do aluno 1: "+ nome[0]+"\nNome do aluno 2: "+ nome[1]+"\nNome do aluno3: "+nome[2]);

    }
}
