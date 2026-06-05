/*
    * EXERCÍCIO 05: CRESCENTE E DECRESCENTE

    * Leia uma quantidade indeterminada de duplas de valores inteiros (X, Y). Para cada dupla de valores, imprima a mensagem "Crescente", caso os valores estejam em ordem crescente, ou "Decrescente", caso os valores estejam em ordem decrescente. O programa deve finalizar quando forem digitados dois valores iguais.
*/

package jesseroder.com.github.exercicios_resolvidos;

import java.util.Scanner;

public class ExercicioResolvido05CrescenteDecrescente {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor para X: ");
        int x = sc.nextInt();

        System.out.print("Digite o valor para Y: ");
        int y = sc.nextInt();

        while (x != y) {

            if (x < y) {
                System.out.println("Crescente");
            } else {
                System.out.println("Decrescente");
            }

            System.out.print("Digite o valor para X: ");
            x = sc.nextInt();

            System.out.print("Digite o valor para Y: ");
            y = sc.nextInt();
        }

        sc.close();
    }
}
