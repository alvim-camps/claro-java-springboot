public class App {
  public static void main(String[] args) throws Exception {
    iPhone iphone = new iPhone("iPhone 7 Plus", "5500", "Preto");

    System.out.println("Modelo: " + iphone.getModelo());
    System.out.println("Versão: " + iphone.getVersao());
    System.out.println("Cor: " + iphone.getCor());

    System.out.println();

    iphone.abrirAba();
    iphone.exibirPagina();
    iphone.atualizarPagina();

    System.out.println();
    
    iphone.ligar();
    iphone.atender();
    iphone.iniciarCorreioVoz();
    
    System.out.println();
    
    iphone.tocarMusica();
    iphone.pausarMusica();
    iphone.selecionarMusica();
  }
}
