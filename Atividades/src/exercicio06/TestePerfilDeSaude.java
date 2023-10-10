package exercicio06;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class TestePerfilDeSaude {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    PerfilDeSaude pessoa1 = new PerfilDeSaude();

    System.out.print("Informe seu nome: ");
    String nome = scanner.nextLine();
    pessoa1.setNome(nome);

    System.out.print("Informe seu sobrenome: ");
    String sobrenome = scanner.nextLine();
    pessoa1.setSobrenome(sobrenome);

    while (true) {
      System.out.print("Informe sua data de nascimento (yyyy-MM-dd): ");
      String input = scanner.nextLine();

      try {
        LocalDate nascimento = LocalDate.parse(input);
        pessoa1.setNascimento(nascimento);
        break;
      } catch (DateTimeParseException e) {
        System.out.println("Você inseriu um formato inválido. Tente novamente (yyyy-MM-dd):");
      }
    }

    System.out.print("Informe seu sexo (M/F): ");
    String sexo = scanner.nextLine();
    pessoa1.setSexo(sexo);

    System.out.print("Informe sua altura em metros: ");
    double altura = scanner.nextDouble();
    pessoa1.setAltura(altura);

    System.out.print("Informe seu peso em quilos: ");
    double peso = scanner.nextDouble();
    pessoa1.setPeso(peso);

    Integer frequenciaMaxima = pessoa1.calcularFrequenciaMaxima();
    String frequenciaAlvo = pessoa1.calcularFrequenciaAlvo();

    System.out.println("--- DADOS DO PACIENTE ---");
    System.out.printf("NOME: %s %s;%n", nome, sobrenome);
    System.out.printf("SEXO: %s;%n", sexo);
    System.out.printf("ALTURA: %.2f;%n", altura);
    System.out.printf("PESO: %.2f;%n", peso);
    System.out.printf("IMC: %.2f;%n", pessoa1.calcularIMC());
    System.out.printf("%s, sua frequência cardíaca máxima é %dbpm, e sua frequência alvo é %s.", nome, frequenciaMaxima, frequenciaAlvo);
  }
}
