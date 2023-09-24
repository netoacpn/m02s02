package exercicio03;

import java.util.Scanner;

public class TestaRetangulo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o comprimento:");
        double comprimento = scanner.nextDouble();

        System.out.println("Informe a largura:");
        double largura = scanner.nextDouble();

        Retangulo retangulo = new Retangulo();
        retangulo.setComprimento(comprimento);
        retangulo.setLargura(largura);

        System.out.printf("Perímetro: %.2f.", retangulo.perimetro());
        System.out.printf("Area: %.2f.", retangulo.area());

    }
}
