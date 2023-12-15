package DAO;

import java.sql.Connection;

public interface CrudDAO {
    Connection connection = null;

    boolean pesquisar(int id);

    boolean remover(int id);

    Connection getConnection();
}
