package exercicio05;

import java.time.LocalDate;
import java.time.Period;

public class FrequenciaCardiaca {
  private String nome;
  private String sobrenome;
  private LocalDate nascimento;

  public FrequenciaCardiaca() {

  }

  public Integer calcularIdade(){
    LocalDate localDate = LocalDate.now();
    Period idade = Period.between(getNascimento(), localDate);
    return idade.getYears();
  }

  public Integer calcularFrequenciaMaxima(){
    Integer frequenciaMaxima;
    return frequenciaMaxima = 220 - calcularIdade();
  }

  public String calcularFrequenciaAlvo(){
    String frequencia1 = String.valueOf(calcularFrequenciaMaxima()*0.50);
    String frequencia2 = String.valueOf(calcularFrequenciaMaxima()*0.85);
    String frequenciaAlvo;
    return frequenciaAlvo = frequencia1 + " e " +  frequencia2 + "bpm";
  }

  public FrequenciaCardiaca(String nome, String sobrenome, LocalDate nascimento) {
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.nascimento = nascimento;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSobrenome() {
    return sobrenome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }

  public LocalDate getNascimento() {
    return nascimento;
  }

  public void setNascimento(LocalDate nascimento) {
    this.nascimento = nascimento;
  }
}
