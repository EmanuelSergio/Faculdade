package aula1;

import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) {

    /*Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
    hora e calcula o salário desse funcionário.
    A seguir, mostre o número e o salário do funcionário, com duas casas decimais.*/

        Scanner leia = new Scanner(System.in);

        int num,horas;
        float valorHora;

        num = leia.nextInt();
        horas = leia.nextInt();
        valorHora = leia.nextFloat();

        float salario = valorHora * horas;

        System.out.printf("NUMBER = %d \nSALARY = %.2f" ,num, salario);


    }
}
