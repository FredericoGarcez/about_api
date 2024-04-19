public class PessoaFisica {
  private String nome;
  private Date dataNascimento;
  private String sexo;
  private Endereco endereco;

  // Getters and setters for all attributes

  // Constructor with all attributes
  public PessoaFisica(String nome, Date dataNascimento, String sexo, Endereco endereco) {
      this.nome = nome;
      this.dataNascimento = dataNascimento;
      this.sexo = sexo;
      this.endereco = endereco;
  }
}