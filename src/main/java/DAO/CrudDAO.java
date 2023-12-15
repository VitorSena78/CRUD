package DAO;

import java.sql.Connection;

public interface CrudDAO {

    boolean remover(int id);

    Connection getConnection();
}
