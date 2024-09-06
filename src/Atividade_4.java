import java.util.Scanner;

public class Atividade_4 {
    public static void main(String[] args) {

        int[] num = new int[3];

        Scanner sc = new Scanner(System.in);
        num[0] = sc.nextInt();
        num[1] = sc.nextInt();
        num[2] = sc.nextInt();

        sc.close();

        System.out.println("Os numeros digitados foram: " + num[0]+","+ num[1] +","+ num[2]);

        double media = (num[0] + num[1] + num[2]) / 3 ;

        System.out.println("A media dos números digitados é: " + media);

    }
}
