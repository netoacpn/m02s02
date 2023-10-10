package exercicio06;

import java.time.LocalDate;
import java.time.Period;

public class PerfilDeSaude {
  private String nome;
  private String sobrenome;
  private String sexo;
  double altura;
  double peso;
  private LocalDate nascimento;

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

  public double calcularIMC(){
    double imc;
    return imc = this.peso / (this.altura*this.altura);
  }

  public PerfilDeSaude() {

  }

  public PerfilDeSaude(String nome, String sobrenome, String sexo, double altura, double peso, LocalDate nascimento) {
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.sexo = sexo;
    this.altura = altura;
    this.peso = peso;
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

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }
}
