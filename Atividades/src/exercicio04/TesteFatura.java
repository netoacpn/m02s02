package exercicio04;

import java.util.Scanner;

public class TesteFatura {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Fatura fatura = new Fatura("0001", "Primeira fatura", 15, 21.95);

        System.out.println(fatura.getValorFatura());
    }
}
