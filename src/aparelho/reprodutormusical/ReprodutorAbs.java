package aparelho.reprodutormusical;

public abstract class ReprodutorAbs implements ReprodutorInterface {

    protected String nome;

    public ReprodutorAbs(String nome) {
        this.nome = nome;
    }

    @Override
    public void tocar() {
        System.out.println(nome + " está tocando ");
    }

    @Override
    public void pausar() {
        System.out.println(nome + "está pausada");
    }

    @Override
    public void selecionarMusica(String nome) {
        this.nome = nome;
        System.out.println("Selecionando música " + nome);
    }

    public String getNome() {
        return nome;
    }

    
}
