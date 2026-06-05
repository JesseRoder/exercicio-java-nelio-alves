/*
 * EXERCÍCIO RESOLVIDO 04 - MENOR DE TRÊS NÚMEROS
 *
 * Fazer um programa para ler três valores inteiros e mostrar qual é o menor entre eles. 
*/

package jesseroder.com.github.exercicios_resolvidos;

import java.util.Scanner;

public class ExercicioResolvido04Menor {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);    

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = sc.nextInt();

        int menor = num1;
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }

        System.out.println("MENOR: " + menor);

        sc.close();
    }
}
