package exercicio01;

import java.util.Scanner;

public class TestaData {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um dia:");
        int dia = scanner.nextInt();

        System.out.println("Digite um mês:");
        int mes = scanner.nextInt();

        System.out.println("Digite um ano:");
        int ano = scanner.nextInt();

        Data novaData = new Data(dia, mes, ano);


        System.out.println(novaData.exibirData());
    }
}
