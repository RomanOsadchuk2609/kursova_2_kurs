package osadchuk.roman.service.sportsmanSportCoach.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import osadchuk.roman.DAO.sportsmanSportCoach.impls.SportsmanSportCoachDAOFakeImpl;
import osadchuk.roman.model.SportsmanSportCoach;
import osadchuk.roman.service.sportsmanSportCoach.interfaces.ISportsmanSportCoachService;

import java.sql.SQLException;
import java.util.List;

@Service
public class SportsmanSportCoachService implements ISportsmanSportCoachService {
    @Autowired
    SportsmanSportCoachDAOFakeImpl sportsmanSportCoachDAO;

    @Override
    public SportsmanSportCoach insertSportsmanSportCoach(SportsmanSportCoach sportsmanSportCoach) throws SQLException {
        return sportsmanSportCoachDAO.insertSportsmanSportCoach(sportsmanSportCoach);
    }

    @Override
    public SportsmanSportCoach getSportsmanSportCoach(int id) throws SQLException {
        return sportsmanSportCoachDAO.getSportsmanSportCoach(id);
    }

    @Override
    public SportsmanSportCoach updateSportsmanSportCoach(SportsmanSportCoach sportsmanSportCoach) throws SQLException {
        return sportsmanSportCoachDAO.updateSportsmanSportCoach(sportsmanSportCoach);
    }

    @Override
    public SportsmanSportCoach deleteSportsmanSportCoach(int id) throws SQLException {
        return sportsmanSportCoachDAO.deleteSportsmanSportCoach(id);
    }

    @Override
    public List<SportsmanSportCoach> getAll() throws SQLException {
        return sportsmanSportCoachDAO.getAll();
    }
}
