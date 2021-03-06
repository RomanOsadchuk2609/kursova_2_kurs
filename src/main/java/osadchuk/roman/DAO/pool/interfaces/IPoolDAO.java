package osadchuk.roman.DAO.pool.interfaces;

import osadchuk.roman.model.Pool;

import java.sql.SQLException;
import java.util.List;

public interface IPoolDAO {
    public Pool insertPool(Pool pool) throws SQLException;
    public Pool getPool(int id) throws SQLException;
    public Pool updatePool(Pool pool) throws SQLException;
    public Pool deletePool(int id) throws SQLException;
    public List<Pool> getAll() throws SQLException;
}
