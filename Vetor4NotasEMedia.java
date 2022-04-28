import java.util.Arrays;
import java.util.Scanner;

public class Vetor4NotasEMedia {
    public static void main(String[] args) {
        int[] notas = new int[4];
        Scanner scan = new Scanner(System.in);
        int i, ordinal;
        float soma=0;
        float media;

        for (i=0; i<notas.length; i++){
            ordinal = i+1;
            System.out.println("Digite a "+ordinal+"ª nota");
            notas[i] = scan.nextInt();
            soma+=notas[i];

        }media = soma/4;
        System.out.println(Arrays.toString(notas));
        System.out.println("a média das quatro notas é igual a: "+media);

    }

    }

