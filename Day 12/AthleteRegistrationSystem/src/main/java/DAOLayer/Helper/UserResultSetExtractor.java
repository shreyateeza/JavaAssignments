package DAOLayer.Helper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import Modal.Athlete;

public class UserResultSetExtractor implements ResultSetExtractor<List<Athlete>> {

	public List<Athlete> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<Athlete> athleteList = new ArrayList<Athlete>();
		while(rs.next()) {
			Athlete athlete = new Athlete();
			athlete.setAthlete_id(rs.getInt(1));
			athlete.setAthlete_name(rs.getString(2));
			athlete.setAthlete_gender(rs.getString(3));
			athlete.setCategory(rs.getString(4));
			athlete.setAthlete_email(rs.getString(5));
			athlete.setAthlete_mobile(rs.getInt(6));
			athleteList.add(athlete);
			}
		return athleteList;
	}
	
}
