package DAO;

import model.FuncionarioGoverno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FuncionarioGovernoDAO implements CrudDAO {
    private Connection connection;

    public FuncionarioGovernoDAO() {
        this.connection = Conexao.getconection();
    }

    public FuncionarioGoverno pesquisar(String nome, String senha) {
        String sql = "SELECT * FROM Tbl_Fun_Gov WHERE nome = ? AND senha = ?";
        FuncionarioGoverno funcionarioDb = new FuncionarioGoverno();
        boolean encontrou = false;
        try {
            PreparedStatement stmt = getConnection().prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, senha);
            ResultSet resultSet = stmt.executeQuery();
            if (resultSet.next()) {
                encontrou = true;
                FuncionarioGoverno funcionario = new FuncionarioGoverno();
                funcionario.setId(resultSet.getInt("id_Fun_Gov"));
                funcionario.setNome(resultSet.getString("nome"));
                funcionario.setSenha(resultSet.getString("senha"));
                System.out.println("Bem vindo, funcionário!");
            } else {
                System.out.println("Erro ao encontrar funcionário");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar no banco de dados");
            throw new RuntimeException(e);
        }
        return encontrou ? funcionarioDb : null;
    }


    @Override
    public boolean remover(int id) {
        return false;
    }

    @Override
    public Connection getConnection() {
        return this.connection;
    }
}
