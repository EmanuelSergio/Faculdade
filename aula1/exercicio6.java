package aula1;

import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {

        /*Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno.
         A seguir, calcule a média do aluno, sabendo que
          a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11).
          Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
.*/

        Scanner leia = new Scanner(System.in);

        int a,b,c,d;

        a = leia.nextInt();
        b = leia.nextInt();
        c = leia.nextInt();
        d = leia.nextInt();

        int diferenca = (a * b - c * d);

        System.out.println("DIFERENCA = " +diferenca);



    }

}
