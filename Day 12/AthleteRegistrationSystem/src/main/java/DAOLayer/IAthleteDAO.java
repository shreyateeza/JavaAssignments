package DAOLayer;

import java.util.List;
import Modal.Athlete;

public interface IAthleteDAO {
	
	public int addAthlete(Athlete athlete);
	public List<Athlete> getAllAthletes();

}
