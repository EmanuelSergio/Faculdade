package aula1;

public class exercicio4 {

    public static void main(String[] args) {

    double a = 1, b=2;

        double formula1, formula2, formula3, formula4, formula5;

        formula1 = (a+b)*(a-b);

        formula2 = (a * a) + (2*a*b) + (b * b);

        formula3 = (a * a) - (2*a*b) + (b *b ) ;

        formula4 = (a+b) * ((a * a) - (a*b) +(b * b));

        formula4 = Math.pow(a, 3) + Math.pow(b, 3);
        formula5 = Math.pow(a, 3) - Math.pow(b, 3);

        System.out.println("Formula: 1: " + formula1);
        System.out.println("Formula: 2: " + formula2);
        System.out.println("Formula: 3: " + formula3);
        System.out.println("Formula: 4: " + formula4);
        System.out.println("Formula: 5: " + formula5);


    }



}
