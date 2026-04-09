package JavaIntermediario.Aulas.Aula13Enum;

public enum RankingMissao {
    S("Altíssimo", 10),
    A("Difícil", 5),
    B("Confortável", 4),
    C("Moderado", 3),
    D("Fácil", 1);


    private String descricao;
    private int dificuldade;

    RankingMissao(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
}
