package osadchuk.roman.DAO.sportBuilding.interfaces;

import osadchuk.roman.model.SportBuilding;

import java.sql.SQLException;
import java.util.List;

public interface ISportBuildingDAO {
    public SportBuilding insertSportBuilding(SportBuilding sportBuilding) throws SQLException;
    public SportBuilding getSportBuilding(int id) throws SQLException;
    public SportBuilding updateSportBuilding(SportBuilding sportBuilding) throws SQLException;
    public SportBuilding deleteSportBuilding(int id) throws SQLException;
    public List<SportBuilding> getAll() throws SQLException;
}
