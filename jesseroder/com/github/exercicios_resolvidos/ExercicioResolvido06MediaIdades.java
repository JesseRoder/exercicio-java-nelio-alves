/*
    EXERCÍCIO RESOLVIDO 06: MÉDIA DE IDADES

    Faça um programa para ler um número indeterminado de idades. O programa deve parar quando for digitada uma idade negativa. No final, mostre a média das idades digitadas. Se for digitada uma idade negativa na primeira vez, mostre a mensagem "Nenhuma idade foi digitada.".
*/

package jesseroder.com.github.exercicios_resolvidos;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido06MediaIdades {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        int somaIdades = 0;
        int contadorIdades = 0;

        if (idade < 0) {
            System.out.println("Nenhuma idade foi digitada.");
        } else {
            while (idade >= 0) {
                somaIdades += idade;
                contadorIdades++;

                System.out.print("Digite a próxima idade: ");
                idade = sc.nextInt();
            }

            double media = (double) somaIdades / contadorIdades;
            System.out.printf("A média das idades digitadas é: %.2f", media);
        }

        sc.close();
    }
}
