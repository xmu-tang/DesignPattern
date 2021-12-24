package FilterPattern.entity;

import java.util.ArrayList;
import java.util.List;

import FilterPattern.api.Criteria;

public class CriteriaFemale implements Criteria{

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> feMalePersons = new ArrayList<>();
		for(Person person : persons) {
			if(person.getGender().equalsIgnoreCase("FEMALE")) {
				feMalePersons.add(person);
			}
		}
		return feMalePersons;
	}
	
}
