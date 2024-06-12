package aparelho.telefone;

public abstract class TelefoneAbs implements TelefoneInterface {

    @Override
    public void ligar(int numero) {
      System.out.println("Ligando para " + numero);
    }
  
    @Override
    public void atender() {
      System.out.println("Atendendo a ligação.");
    }
  
    @Override
    public void iniciarCorreioVoz() {
      System.out.println("Correio de voz.");
    }
  }
  
