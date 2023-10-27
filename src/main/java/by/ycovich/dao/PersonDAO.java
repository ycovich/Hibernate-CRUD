package by.ycovich.dao;

import by.ycovich.model.Person;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class PersonDAO {
    private final EntityManager entityManager;

    @Autowired
    public PersonDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional(readOnly = true)
    public  void test(){
        Session session = entityManager.unwrap(Session.class);

//        [N+1 Problem]
//        List<Person> people = session.createQuery("select p from Person p", Person.class)
//                .getResultList();
//
//        for (Person p : people){
//            System.out.println(p + ", items: "+p.getItems());
//        }

        List<Person> people = session.createQuery("select distinct p from Person p left join fetch p.items", Person.class)
                .getResultList();
        for (Person p : people){
            System.out.println(p + ", items: "+p.getItems());
        }
    }
}
