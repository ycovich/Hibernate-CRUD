package by.ycovich.dao;

import by.ycovich.model.Person;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class PersonDAO {

    public List<Person> index() {
        return null;
    }

    public Person show(int id) {
        return null;
    }

    public void save(Person person) {

    }

    public void update(int id, Person updatedPerson) {

    }

    public void delete(int id) {

    }
}
