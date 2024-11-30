public class ArvoreFrutifera implements Arvore {
    private String nome;
    private String descricao;
    private String habitat;

    public ArvoreFrutifera(String nome, String descricao, String habitat) {
        this.nome = nome;
        this.descricao = descricao;
        this.habitat = habitat;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public boolean isFrutifera() {
        return true;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String getHabitat() {
        return habitat;
    }
}
