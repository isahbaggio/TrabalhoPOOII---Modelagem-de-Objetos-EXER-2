import java.sql.*;

public class EngenheiroDAO {
    private Connection connection;

    public EngenheiroDAO() throws SQLException {
        this.connection = ConexaoBD.getInstance().getConnection();
    }

    public void inserirEngenheiro(Engenheiro engenheiro) throws SQLException {
        String sql = "INSERT INTO Engenheiro (ID_Engenheiro, Nome_Engenheiro, Especialidade) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, engenheiro.getIdEngenheiro());
            stmt.setString(2, engenheiro.getNomeEngenheiro());
            stmt.setString(3, engenheiro.getEspecialidade());
            stmt.executeUpdate();
        }
    }
}
