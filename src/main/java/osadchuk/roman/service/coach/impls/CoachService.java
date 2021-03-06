package osadchuk.roman.service.coach.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import osadchuk.roman.DAO.coach.impls.CoachDAOFakeImpl;
import osadchuk.roman.model.Coach;
import osadchuk.roman.service.coach.interfaces.ICoachService;

import java.sql.SQLException;
import java.util.List;

@Service
public class CoachService implements ICoachService {
    @Autowired
    CoachDAOFakeImpl coachDAO;

    @Override
    public Coach insertCoach(Coach coach) throws SQLException {
        coachDAO.insertCoach(coach);
        return coach;
    }

    @Override
    public Coach getCoach(int id) throws SQLException {
        return coachDAO.getCoach(id);
    }

    @Override
    public Coach updateCoach(Coach coach) throws SQLException {
        return coachDAO.updateCoach(coach);
    }

    @Override
    public Coach deleteCoach(int id) throws SQLException {
        return coachDAO.deleteCoach(id);
    }

    @Override
    public List<Coach> getAll() throws SQLException {
        return coachDAO.getAll();
    }
}
