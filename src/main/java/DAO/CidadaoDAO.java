package DAO;

import model.Cidadao;
import org.jetbrains.annotations.NotNull;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CidadaoDAO implements CrudDAO {

    private Connection connection;

    public CidadaoDAO() {
        this.connection = Conexao.getconection();
    }

    public List<Cidadao> listar() {
        String sql = "SELECT * FROM Tbl_Cidadao";
        List<Cidadao> cidadaoDb = new ArrayList<>();
        try {
            PreparedStatement stmt = getConnection().prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                Cidadao cidadao = new Cidadao();
                cidadao.setId(resultSet.getInt("id_Cidadao"));
                cidadao.setData_nascimento(String.valueOf(resultSet.getDate("dt_nascimento")));
                cidadao.setNome(resultSet.getString("nome"));
                cidadao.setSenha(resultSet.getString("senha"));
                cidadao.setEmail(resultSet.getString("email"));
                cidadaoDb.add(cidadao);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return cidadaoDb;
    }

    public Cidadao pesquisar(String nome, String senha) {
        String sql = "SELECT * FROM Tbl_Cidadao WHERE nome = ? AND senha = ?";
        Cidadao cidadaoDb = new Cidadao();
        boolean encontrou = false;
        try {
            PreparedStatement stmt = getConnection().prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, senha);
            ResultSet resultSet = stmt.executeQuery();
            if (resultSet.next()) {
                cidadaoDb.setId(resultSet.getInt("id_Cidadao"));
                cidadaoDb.setNome(resultSet.getString("nome"));
                cidadaoDb.setEmail(resultSet.getString("email"));
                cidadaoDb.setSenha(resultSet.getString("senha"));
                cidadaoDb.setData_nascimento(String.valueOf(resultSet.getDate("dt_nascimento")));
                System.out.println("login bem sucedido");
            } else {
                System.out.println("erro ao consultar cidadão do banco de dados");
            }
        } catch (SQLException e) {
            System.out.println("erro ao consultar no banco de dados");
            throw new RuntimeException(e);
        }
        return cidadaoDb;
    }

    public boolean inserir(@NotNull Cidadao cidadao) {
        String sql = "INSERT INTO Tbl_Cidadao(nome, dt_nascimento, email, senha) VALUES(?, ?, ?, ?)";
        try {
            PreparedStatement stmt = getConnection().prepareStatement(sql);
            stmt.setString(1, cidadao.getNome());
            stmt.setString(2, cidadao.getData_nascimento());
            stmt.setString(3, cidadao.getEmail());
            stmt.setString(4, cidadao.getSenha());
            stmt.execute();
            System.out.println("cadastro realizado com sucesso");
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean alterar(@NotNull Cidadao cidadao) {
        String sql = "UPDATE Tbl_Cidadao SET nome=?, email=?, senha=? WHERE id_Cidadao=?";
        try {
            PreparedStatement stmt = getConnection().prepareStatement(sql);
            stmt.setString(1, cidadao.getNome());
            stmt.setString(2, cidadao.getEmail());
            stmt.setString(3, cidadao.getSenha());
            stmt.setInt(4, cidadao.getId());
            stmt.execute();
            System.out.println(cidadao.getNome());
            System.out.println(cidadao.getEmail());
            System.out.println(cidadao.getSenha());
            System.out.println(cidadao.getId());
            System.out.println("usuário alterado!");
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public boolean remover(int id) {
        String sql = "DELETE FROM Tbl_Cidadao Where id_Cidadao=?";
        try {
            PreparedStatement stmt = getConnection().prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            System.out.println("usuário apagada!");
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }

    }

    @Override
    public Connection getConnection() {
        return this.connection;
    }
}
