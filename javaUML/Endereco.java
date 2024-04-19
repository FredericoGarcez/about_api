public class Endereco {
  private TipoLogradouro tipoLogradouro;
  private String nome;
  private Integer numero;
  private String complemento;
  private Integer CEP;
  private TipoEndereco tipoEndereco;
  private Bairro bairro;

  // Getters and setters for all attributes

  // Constructor with all attributes
  public Endereco(TipoLogradouro tipoLogradouro, String nome, Integer numero, String complemento, Integer CEP, TipoEndereco tipoEndereco, Bairro bairro) {
      this.tipoLogradouro = tipoLogradouro;
      this.nome = nome;
      this.numero = numero;
      this.complemento = complemento;
      this.CEP = CEP;
      this.tipoEndereco = tipoEndereco;
      this.bairro = bairro;
  }
}