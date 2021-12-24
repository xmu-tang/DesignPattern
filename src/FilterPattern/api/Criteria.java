package FilterPattern.api;

import java.util.List;

import FilterPattern.entity.Person;

public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons);
}
