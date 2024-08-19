import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlocacaoOperarioDAO {
    private Connection connection;

    public AlocacaoOperarioDAO() throws SQLException {
        this.connection = ConexaoBD.getInstance().getConnection();
    }

    public void alocarOperario(int idProjeto, int idOperario) throws SQLException {
        String sql = "INSERT INTO Alocacao_Operario (ID_Projeto, ID_Operario) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idProjeto);
            stmt.setInt(2, idOperario);
            stmt.executeUpdate();
        }
    }
}
