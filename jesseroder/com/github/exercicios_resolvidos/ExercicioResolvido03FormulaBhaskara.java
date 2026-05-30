/* 
* EXERCÍCIO RESOLVIDO 03 - FÓRMULA DE BHASKARA
* 
* Fazer um programa para ler os valores dos coeficientes A, B e C,de ponto flutuante de uma equação do segundo grau e calcular as raízes da equação, usando a fórmula de Bhaskara. O programa deve mostrar as raízes com cinco casas decimais, ou uma mensagem de "Impossível calcular", caso não seja possível calcular as raízes.
*/

package jesseroder.com.github.exercicios_resolvidos;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido03FormulaBhaskara {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = sc.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = sc.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = sc.nextDouble();
        
        double delta = Math.pow(b, 2) - 4 * a * c;   

        if (delta < 0 || a == 0) {
            System.out.println("Impossível calcular");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("Raiz 1 = %.5f%n", x1);
            System.out.printf("Raiz 2 = %.5f%n", x2);
        }

        sc.close();

    }
}
