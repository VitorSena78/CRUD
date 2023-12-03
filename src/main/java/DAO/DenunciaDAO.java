package DAO;

import model.Cidadao;
import model.Denuncia;
import org.jetbrains.annotations.NotNull;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DenunciaDAO {
    private Connection connection;

    public DenunciaDAO() {
        this.connection = Conexao.getconection();
    }

    public List<Denuncia> listar() {
        String sql = "SELECT * FROM Tbl_Denuncia";
        List<Denuncia> denunciasDb = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                Denuncia denuncia = new Denuncia();
                denuncia.setId(resultSet.getInt("id_Denuncia"));
                denuncia.setDescricao(resultSet.getString("descrição"));
                denuncia.setLocalizacao(resultSet.getString("localizacao"));
                denunciasDb.add(denuncia);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return denunciasDb;
    }

    public List<Denuncia> listarById(Cidadao cidadao) {
        String sql = "SELECT * FROM Tbl_Denuncia WHERE Tbl_Cidadao_id_Cidadao = ?";
        List<Denuncia> denunciasDb = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, cidadao.getId());
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                Denuncia denuncia = new Denuncia();
                denuncia.setId(resultSet.getInt("id_Denuncia"));
                denuncia.setDescricao(resultSet.getString("descrição"));
                denuncia.setLocalizacao(resultSet.getString("localizacao"));
                denunciasDb.add(denuncia);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return denunciasDb;
    }

    public boolean inserir(@NotNull Denuncia denuncia) {
        //String sql = "INSERT INTO Tbl_Denuncia(descrição, localizacao, imagem_anexada, fk_id_Cidadao) VALUES(?, ?, ?, ?,?)";
        String sql = "INSERT INTO Tbl_Denuncia(Tbl_Cidadao_id_Cidadao, descrição, localizacao, imagem_anexada) VALUES(?, ?, ?, ?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, denuncia.getCidadiaId());
            stmt.setString(2, denuncia.getDescricao());
            stmt.setString(3, denuncia.getLocalizacao());
            stmt.setString(4, null);
            //stmt.setInt(5, denuncia.getCidadiaId());
            stmt.execute();
            System.out.println("cadastro da denuncia bem sucedida");
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean alterar(@NotNull Denuncia denuncia) {
        String sql = "UPDATE Tbl_Denuncia SET descrição=?,  localizacao=? WHERE id_Denuncia=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, denuncia.getDescricao());
            stmt.setString(2, denuncia.getLocalizacaoC());
            stmt.setInt(3, denuncia.getId());
            stmt.execute();
            System.out.println("update de statos!");
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean remover(int id) {
        String sql = "DELETE FROM Tbl_Denuncia WHERE id_Denuncia=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            System.out.println("denuncia apagada!");
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
