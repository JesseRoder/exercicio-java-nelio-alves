/*
    * EXERCÍCIO RESOLVIDO 02 - NOTA FINAL
    * 
    * Fazer um programa para ler as  duas notas que um aluno obteve em duas avaliações de uma disciplina anual. Em seguida, calcular e mostrar a nota final do aluno, junto com um texto informativo. Caso a nota final seja menor que 60, mostrar uma mensagem "REPROVADO".
*/

package jesseroder.com.github.exercicios_resolvidos;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido02NotaFinal {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double notaFinal = nota1 + nota2;

        System.out.printf("NOTA FINAL: %.1f%n", notaFinal);

        if (notaFinal < 60) {
            System.out.println("REPROVADO");
        }

        sc.close();
    }
}
