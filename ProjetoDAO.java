import java.sql.*;

public class ProjetoDAO {
    private Connection connection;

    public ProjetoDAO() throws SQLException {
        this.connection = ConexaoBD.getInstance().getConnection();
    }

    public void inserirProjeto(Projeto projeto) throws SQLException {
        String sql = "INSERT INTO Projeto (ID_Projeto, Nome_Projeto, Local, Data_Inicio, Data_Termino) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, projeto.getIdProjeto());
            stmt.setString(2, projeto.getNomeProjeto());
            stmt.setString(3, projeto.getLocal());
            stmt.setDate(4, new java.sql.Date(projeto.getDataInicio().getTime()));
            stmt.setDate(5, new java.sql.Date(projeto.getDataTermino().getTime()));
            stmt.executeUpdate();
        }
    }
}
