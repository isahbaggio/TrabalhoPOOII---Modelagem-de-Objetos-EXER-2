import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlocacaoEngenheiroDAO {
    private Connection connection;

    public AlocacaoEngenheiroDAO() throws SQLException {
        this.connection = ConexaoBD.getInstance().getConnection();
    }

    public void alocarEngenheiro(int idProjeto, int idEngenheiro) throws SQLException {
        String sql = "INSERT INTO Alocacao_Engenheiro (ID_Projeto, ID_Engenheiro) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idProjeto);
            stmt.setInt(2, idEngenheiro);
            stmt.executeUpdate();
        }
    }
}