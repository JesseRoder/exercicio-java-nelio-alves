/* 
    Leia 2 números inteiros e imprima a soma dos números ímpares entre eles, excluindo os números digitados.
*/

package jesseroder.com.github.exercicios_resolvidos;

import java.util.Scanner;

public class ExercicioResolvido08SomaImpares {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int segundoNumero = scanner.nextInt();

        int minimo = Math.min(primeiroNumero, segundoNumero);
        int maximo = Math.max(primeiroNumero, segundoNumero);
        
        int somaImpares = 0;
        for (int i = minimo + 1; i < maximo; i++) {
            if (i % 2 != 0) {
                somaImpares += i;
            }
        }

        System.out.println("Soma dos números ímpares entre " + minimo + " e " + maximo + " = " + somaImpares);

        scanner.close();
    }
}
