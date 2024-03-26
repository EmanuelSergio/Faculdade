package aula1;

public class exercicio3 {
    public static void main(String[] args) {

        planeta plnt1 = new planeta();
        planeta plnt2 = new planeta();
        planeta plnt3 = new planeta();

        plnt1.setNome("terra");
        plnt1.setValor(15);

        plnt2.setNome("marte");
        plnt2.setValor(20);

        plnt3.setNome("Jupter");
        plnt3.setValor(30);

        System.out.println(plnt1.toString());

        System.out.print("a " +plnt1.getNome() +" tem 4 vezes o tamanho de marte");

    }




}
