/*
    Leia um número inteiro e imprima a sua tabuada de 1 a 10.
*/

package jesseroder.com.github.exercicios_resolvidos;
import java.util.Scanner;   

public class ExercicioResolvido07Tabuada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para ver sua tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}