public class Operario {
    private int idOperario;
    private String nomeOperario;
    private String funcao;

    public Operario(int idOperario, String nomeOperario, String funcao) {
        this.idOperario = idOperario;
        this.nomeOperario = nomeOperario;
        this.funcao = funcao;
    }

    public int getIdOperario() {
        return idOperario;
    }

    public String getNomeOperario() {
        return nomeOperario;
    }

    public String getFuncao() {
        return funcao;
    }

    // Setters
    public void setIdOperario(int idOperario) {
        this.idOperario = idOperario;
    }

    public void setNomeOperario(String nomeOperario) {
        this.nomeOperario = nomeOperario;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
