public class iPhone implements ReprodutorMusical, NavegadorWeb, AparelhoTelefonico {
  private String modelo;
  private String versao;
  private String cor;

  iPhone(String modelo, String versao, String cor) {
    this.modelo = modelo;
    this.versao = versao;
    this.cor = cor;
  }

  public String getModelo() {
    return modelo;
  }

  public String getVersao() {
    return versao;
  }

  public String getCor() {
    return cor;
  }

  /* Interface Reprodutor Musical */
  @Override
  public void tocarMusica() {
    System.out.println("Tocando música no iPhone.");
  }

  @Override
  public void pausarMusica() {
    System.out.println("Pausando música no iPhone.");
  }

  @Override
  public void selecionarMusica() {
    System.out.println("Selecionando música no iPhone.");
  }

  /* Interface Navegador Web */
  @Override
  public void abrirAba() {
    System.out.println("Abrindo aba no Safari.");
  }

  @Override
  public void exibirPagina() {
    System.out.println("Exibindo página no Safari.");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Atualizando página no Safari.");
  }

  /* Interface Aparelho Telefônico */
  @Override
  public void ligar() {
    System.out.println("Ligando pelo iPhone.");
  }

  @Override
  public void atender() {
    System.out.println("Atendendo pelo iPhone.");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de voz no iPhone.");
  }
}
