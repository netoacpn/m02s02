package exercicio05;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    FrequenciaCardiaca calculo = new FrequenciaCardiaca();

    System.out.print("Informe seu nome: ");
    String nome = scanner.nextLine();
    calculo.setNome(nome);

    System.out.print("Informe seu sobrenome: ");
    String sobrenome = scanner.nextLine();
    calculo.setSobrenome(sobrenome);

    System.out.print("Informe sua data da nascimento (yyyy-MM-dd): ");
    LocalDate nascimento = LocalDate.parse(scanner.nextLine());
    calculo.setNascimento(nascimento);

    Integer idade = calculo.calcularIdade();

    Integer frequenciaMaxima = calculo.calcularFrequenciaMaxima();
    String frequenciaAlvo = calculo.calcularFrequenciaAlvo();
    System.out.printf("%s, sua frequência cardíaca máxima é %dbpm, e sua frequência alvo é %s.", nome, frequenciaMaxima, frequenciaAlvo);



  }
}
