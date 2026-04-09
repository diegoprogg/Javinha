package JavaIntermediario.Aulas.Aula13Enum;

public class Missao {
    private String nome;
    private RankingMissao rankingMissao;

    public void exibirDetalhes(){
        System.out.println("Missão: " + nome + " | Rank: " + rankingMissao + " (" + "Descrição: " + rankingMissao.getDescricao() + ". Dificuldade: " + rankingMissao.getDificuldade() + ")");
    }

    public Missao(String nome, RankingMissao rankingMissao) {
        this.nome = nome;
        this.rankingMissao = rankingMissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankingMissao getRankingMissao() {
        return rankingMissao;
    }

    public void setRankingMissao(RankingMissao rankingMissao) {
        this.rankingMissao = rankingMissao;
    }
}
