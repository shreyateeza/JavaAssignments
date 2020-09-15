package SpringController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



import DAOLayer.IAthleteDAO;
import Modal.Athlete;

public class AthleteController {

	@Autowired
	IAthleteDAO athleteDao;
	
	@RequestMapping(value="register")
	public String getForm() {
		return "register";
	}
	
		
	@RequestMapping(value="/addAthlete", method=RequestMethod.POST)	
	public String addAthlete(@ModelAttribute Athlete athlete) {
		athleteDao.addAthlete(athlete);		
		return "registered";
	}
	
	@RequestMapping(value="displayAthletes")
	public ModelAndView getAllAthletes(){
		List<Athlete> athleteList = athleteDao.getAllAthletes();
		return new ModelAndView("display", "athleteList", athleteList);
	}
	
}
