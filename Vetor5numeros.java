import java.util.Arrays;
import java.util.Scanner;

public class Vetor5numeros {
    public static void main(String[] args) {
        int[] numero = new int[5];
        Scanner scan = new Scanner(System.in);
        int i, ordinal;

        for (i=0; i<numero.length; i++){
            ordinal = i+1;
            System.out.println("Digite o "+ordinal+"º número");
            numero[i] = scan.nextInt();

        }
        System.out.println(Arrays.toString(numero));
    }

}
