package by.ycovich.repository;

import by.ycovich.model.Item;
import by.ycovich.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemsRepository extends JpaRepository<Item, Integer> {
    List<Item> findByName(String itemName);
    List<Item> findByOwner(Person owner);
}
