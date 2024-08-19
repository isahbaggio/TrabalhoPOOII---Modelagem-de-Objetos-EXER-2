import java.sql.Date;

public class Projeto {
    private int idProjeto;
    private String nomeProjeto;
    private String local;
    private Date dataInicio;
    private Date dataTermino;

    public Projeto(int idProjeto, String nomeProjeto, String local, Date dataInicio, Date dataTermino) {
        this.idProjeto = idProjeto;
        this.nomeProjeto = nomeProjeto;
        this.local = local;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
    }

    public int getIdProjeto() {
        return idProjeto;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public String getLocal() {
        return local;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setIdProjeto(int idProjeto) {
        this.idProjeto = idProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }
}
