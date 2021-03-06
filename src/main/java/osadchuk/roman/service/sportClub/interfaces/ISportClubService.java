package osadchuk.roman.service.sportClub.interfaces;

import osadchuk.roman.model.SportClub;

import java.sql.SQLException;
import java.util.List;

public interface ISportClubService {
    public SportClub insertSportClub(SportClub sportClub) throws SQLException;
    public SportClub getSportClub(int id) throws SQLException;
    public SportClub updateSportClub(SportClub sportClub) throws SQLException;
    public SportClub deleteSportClub(int id) throws SQLException;
    public List<SportClub> getAll() throws SQLException;
}
