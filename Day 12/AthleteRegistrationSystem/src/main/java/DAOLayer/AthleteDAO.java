package DAOLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import DAOLayer.Helper.UserResultSetExtractor;
import Modal.Athlete;

public class AthleteDAO implements IAthleteDAO {
	
	static int id=1000;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int addAthlete(Athlete athlete) {
		String query = "INSERT INTO athlete VALUES(?,?,?,?,?,?)";
		athlete.setAthlete_id(++id);
		int status = jdbcTemplate.update(query, athlete.getAthlete_id(), athlete.getAthlete_name(), athlete.getAthlete_gender(), athlete.getCategory(), athlete.getAthlete_email(), athlete.getAthlete_mobile());
		return status;		
	}

	public List<Athlete> getAllAthletes() {
		String sql = "SELECT * FROM athlete";
		List<Athlete> athleteList = jdbcTemplate.query(sql, new UserResultSetExtractor());
		return athleteList;
	}

}
