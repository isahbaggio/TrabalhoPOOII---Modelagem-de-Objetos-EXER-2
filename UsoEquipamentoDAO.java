import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsoEquipamentoDAO {
    private Connection connection;

    public UsoEquipamentoDAO() throws SQLException {
        this.connection = ConexaoBD.getInstance().getConnection();
    }

    public void registrarUsoEquipamento(int idProjeto, int idEquipamento) throws SQLException {
        String sql = "INSERT INTO Uso_Equipamento (ID_Projeto, ID_Equipamento) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idProjeto);
            stmt.setInt(2, idEquipamento);
            stmt.executeUpdate();
        }
    }
}
