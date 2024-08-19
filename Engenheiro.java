public class Engenheiro {
    private int idEngenheiro;
    private String nomeEngenheiro;
    private String especialidade;

    public Engenheiro(int idEngenheiro, String nomeEngenheiro, String especialidade) {
        this.idEngenheiro = idEngenheiro;
        this.nomeEngenheiro = nomeEngenheiro;
        this.especialidade = especialidade;
    }

    public int getIdEngenheiro() {
        return idEngenheiro;
    }

    public String getNomeEngenheiro() {
        return nomeEngenheiro;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setIdEngenheiro(int idEngenheiro) {
        this.idEngenheiro = idEngenheiro;
    }

    public void setNomeEngenheiro(String nomeEngenheiro) {
        this.nomeEngenheiro = nomeEngenheiro;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
